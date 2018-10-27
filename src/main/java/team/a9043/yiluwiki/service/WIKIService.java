package team.a9043.yiluwiki.service;

import com.github.pagehelper.PageHelper;
import org.springframework.stereotype.Service;
import team.a9043.yiluwiki.entity.YwPage;
import team.a9043.yiluwiki.entity.YwPageExample;
import team.a9043.yiluwiki.mapper.YwPageMapper;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class WIKIService {
    @Resource
    private YwPageMapper ywPageMapper;

    public YwPage getPage(Integer ypId) throws ResourceNotFoundException {
        YwPage ywPage = ywPageMapper.selectByPrimaryKey(ypId);
        if (null == ywPage)
            throw new ResourceNotFoundException(String.format("page %s not found", ypId));
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
        return ywPageMapper.selectByExample(ywPageExample);
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
}
