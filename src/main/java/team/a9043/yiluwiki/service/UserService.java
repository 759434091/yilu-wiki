package team.a9043.yiluwiki.service;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;
import team.a9043.yiluwiki.entity.YwUser;
import team.a9043.yiluwiki.entity.YwUserExample;
import team.a9043.yiluwiki.exception.InvalidParameterException;
import team.a9043.yiluwiki.exception.RemoteServerException;
import team.a9043.yiluwiki.mapper.YwUserMapper;
import team.a9043.yiluwiki.service_pojo.TokenResult;
import team.a9043.yiluwiki.util.JwtUtil;

import javax.annotation.Resource;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Optional;

@Service
public class UserService {
    @Value("${github-app.client-id}")
    private String clientId;
    @Value("${github-app.client-secret}")
    private String clientSecret;
    private RestTemplate restTemplate = getRestTemplate();
    @Resource
    private YwUserMapper ywUserMapper;

    private RestTemplate getRestTemplate() {
        RestTemplateBuilder restTemplateBuilder = new RestTemplateBuilder();
        return restTemplateBuilder
                .defaultMessageConverters()
                .build();
    }

    public TokenResult getToken(String code) throws RemoteServerException, InvalidParameterException {
        MultiValueMap<String, String> headerMap = new LinkedMultiValueMap<>();
        headerMap.add("Accept", "application/json");
        HttpEntity request = new HttpEntity(headerMap);

        ResponseEntity<String> responseEntity = restTemplate.postForEntity(
                String.format("https://github.com/login/oauth/access_token?client_id=%s&client_secret=%s&code=%s", clientId, clientSecret, code),
                request,
                String.class);

        if (responseEntity.getStatusCode().isError())
            throw new RemoteServerException(responseEntity.getBody());

        JSONObject tokenJSON = new JSONObject(responseEntity.getBody());
        String accessToken = tokenJSON.optString("access_token");
        if (accessToken.isEmpty())
            throw new InvalidParameterException(responseEntity.getBody());

        responseEntity = restTemplate.getForEntity(
                String.format("https://api.github.com/user?access_token=%s", accessToken),
                String.class
        );

        if (responseEntity.getStatusCode().isError())
            throw new RemoteServerException(responseEntity.getBody());

        JSONObject userJSON = new JSONObject(responseEntity.getBody());

        Integer githubId = userJSON.getInt("id");
        YwUserExample ywUserExample = new YwUserExample();
        ywUserExample.createCriteria().andYuGithubIdEqualTo(githubId);

        return Optional.of(ywUserMapper
                .selectByExample(ywUserExample))
                .filter(l -> !l.isEmpty())
                .map(l -> l.get(0))
                .map(u -> {
                    HashMap<String, Object> claimMap = new HashMap<>();
                    claimMap.put("yuId", u.getYuId());
                    claimMap.put("yuName", u.getYuName());
                    String token = JwtUtil.createJWT(claimMap, Calendar.MONTH, 1);
                    return new TokenResult(token, u);
                })
                .orElseGet(() -> {
                    YwUser ywUser = new YwUser();
                    ywUser.setYuLogin(userJSON.getString("login"));
                    ywUser.setYuGithubId(userJSON.optInt("id"));
                    ywUser.setYuNodeId(userJSON.optString("node_id"));
                    ywUser.setYuName(Optional
                            .of(userJSON.optString("name"))
                            .filter(n -> !n.isEmpty())
                            .orElse(userJSON.getString("login")));
                    ywUser.setYuAvatarUrl(userJSON.optString("avatar_url"));
                    ywUser.setYuHtmlUrl(userJSON.optString("html_url"));
                    ywUser.setYuBio(userJSON.optString("bio"));
                    ywUserMapper.insert(ywUser);

                    HashMap<String, Object> claimMap = new HashMap<>();
                    claimMap.put("yuId", ywUser.getYuId());
                    claimMap.put("yuName", ywUser.getYuName());
                    String token = JwtUtil.createJWT(claimMap, Calendar.MONTH, 1);
                    return new TokenResult(token, ywUser);
                });

    }
}
