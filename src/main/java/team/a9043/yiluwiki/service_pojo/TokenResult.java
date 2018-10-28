package team.a9043.yiluwiki.service_pojo;

import lombok.Data;
import team.a9043.yiluwiki.entity.YwUser;

/**
 * @author a9043
 */

@Data
public class TokenResult {
    private String accessToken;
    private YwUser ywUser;

    public TokenResult(String accessToken, YwUser ywUser) {
        this.accessToken = accessToken;
        this.ywUser = ywUser;
    }
}
