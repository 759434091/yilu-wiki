package team.a9043.yiluwiki.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import team.a9043.yiluwiki.entity.YwUser;
import team.a9043.yiluwiki.entity.YwUserExample;

public interface YwUserMapper {
    long countByExample(YwUserExample example);

    int deleteByExample(YwUserExample example);

    int deleteByPrimaryKey(Integer yuId);

    int insert(YwUser record);

    int insertSelective(YwUser record);

    List<YwUser> selectByExample(YwUserExample example);

    YwUser selectByPrimaryKey(Integer yuId);

    int updateByExampleSelective(@Param("record") YwUser record, @Param("example") YwUserExample example);

    int updateByExample(@Param("record") YwUser record, @Param("example") YwUserExample example);

    int updateByPrimaryKeySelective(YwUser record);

    int updateByPrimaryKey(YwUser record);
}