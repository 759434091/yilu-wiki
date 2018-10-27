package team.a9043.yiluwiki.service;

import com.github.pagehelper.PageHelper;
import lombok.extern.slf4j.Slf4j;
import org.json.JSONObject;
import org.springframework.stereotype.Service;
import team.a9043.yiluwiki.entity.YwPage;
import team.a9043.yiluwiki.entity.YwPageExample;
import team.a9043.yiluwiki.exception.InvalidParameterException;
import team.a9043.yiluwiki.mapper.YwPageMapper;
import team.a9043.yiluwiki.service_pojo.OperationResponse;
import team.a9043.yiluwiki.service_pojo.VoidOperationResponse;
import team.a9043.yiluwiki.service_pojo.VoidSuccessOperationResponse;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class WIKIService {
    @Resource
    private YwPageMapper ywPageMapper;

    public YwPage getPage(Integer ypId) throws ResourceNotFoundException {
        YwPage ywPage = ywPageMapper.selectByPrimaryKey(ypId);
        if (null == ywPage)
            throw new ResourceNotFoundException(String.format("page %s not found", ypId));
        log.debug("Get page " + ypId);
        return ywPage;
    }

    public List<YwPage> getPages(String ypName, String ypType, String ypAbstract, Integer page, Integer pageSize) {
        YwPageExample ywPageExample = new YwPageExample();
        YwPageExample.Criteria criteria = ywPageExample.createCriteria();
        if (null != ypName)
            criteria.andYpNameLike(getFuzzySearch(ypName));
        if (null != ypType)
            criteria.andYpNameLike(getFuzzySearch(ypType));
        if (null != ypAbstract)
            criteria.andYpAbstractLike("%" + ypAbstract + "%");
        PageHelper.startPage(page, pageSize);
        if (log.isDebugEnabled()) {
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("ypName", ypName);
            jsonObject.put("ypType", ypType);
            jsonObject.put("ypAbstract", ypAbstract);
            jsonObject.put("page", page);
            jsonObject.put("pageSize", pageSize);
            log.debug("Get page " + jsonObject.toString());
        }
        return ywPageMapper.selectByExample(ywPageExample);
    }

    public OperationResponse<YwPage> insertPage(YwPage ywPage) {
        ywPageMapper.insert(ywPage);
        log.info("Insert page " + ywPage.getYpId());
        return new OperationResponse<>(true, "success", ywPage);
    }

    public OperationResponse<YwPage> modifyPage(Integer ypId, YwPage ywPage) throws InvalidParameterException {
        YwPage stdPage = ywPageMapper.selectByPrimaryKey(ypId);
        if (null == stdPage)
            throw new InvalidParameterException("Invalid page " + ypId);

        ywPage.setYpId(ypId);
        ywPageMapper.updateByPrimaryKeyWithBLOBs(ywPage);
        log.info("Modify page " + ywPage.getYpId());
        return new OperationResponse<>(true, "success", ywPage);
    }

    private static String getFuzzySearch(String fuzzyName) {
        return Optional
                .ofNullable(fuzzyName)
                .filter(name -> !name.equals(""))
                .map((name) -> {
                    StringBuilder cozSearchBuilder = new StringBuilder();
                    Arrays.stream(name.split("")).forEach(ch -> cozSearchBuilder.append("%").append(ch));
                    cozSearchBuilder.append("%");
                    return cozSearchBuilder.toString();
                })
                .orElse("%");
    }

    public VoidOperationResponse deletePage(Integer ypId) {
        ywPageMapper.deleteByPrimaryKey(ypId);
        return VoidSuccessOperationResponse.SUCCESS;
    }
}
