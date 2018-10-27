package team.a9043.yiluwiki.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import team.a9043.yiluwiki.entity.YwPage;
import team.a9043.yiluwiki.entity.YwPageExample;

public interface YwPageMapper {
    long countByExample(YwPageExample example);

    int deleteByExample(YwPageExample example);

    int deleteByPrimaryKey(Integer ypId);

    int insert(YwPage record);

    int insertSelective(YwPage record);

    List<YwPage> selectByExampleWithBLOBs(YwPageExample example);

    List<YwPage> selectByExample(YwPageExample example);

    YwPage selectByPrimaryKey(Integer ypId);

    int updateByExampleSelective(@Param("record") YwPage record, @Param("example") YwPageExample example);

    int updateByExampleWithBLOBs(@Param("record") YwPage record, @Param("example") YwPageExample example);

    int updateByExample(@Param("record") YwPage record, @Param("example") YwPageExample example);

    int updateByPrimaryKeySelective(YwPage record);

    int updateByPrimaryKeyWithBLOBs(YwPage record);

    int updateByPrimaryKey(YwPage record);
}