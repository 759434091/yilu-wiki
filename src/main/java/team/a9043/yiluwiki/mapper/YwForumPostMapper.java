package team.a9043.yiluwiki.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import team.a9043.yiluwiki.entity.YwForumPost;
import team.a9043.yiluwiki.entity.YwForumPostExample;

public interface YwForumPostMapper {
    long countByExample(YwForumPostExample example);

    int deleteByExample(YwForumPostExample example);

    int deleteByPrimaryKey(Integer yfpId);

    int insert(YwForumPost record);

    int insertSelective(YwForumPost record);

    List<YwForumPost> selectByExampleWithBLOBs(YwForumPostExample example);

    List<YwForumPost> selectByExample(YwForumPostExample example);

    YwForumPost selectByPrimaryKey(Integer yfpId);

    int updateByExampleSelective(@Param("record") YwForumPost record, @Param("example") YwForumPostExample example);

    int updateByExampleWithBLOBs(@Param("record") YwForumPost record, @Param("example") YwForumPostExample example);

    int updateByExample(@Param("record") YwForumPost record, @Param("example") YwForumPostExample example);

    int updateByPrimaryKeySelective(YwForumPost record);

    int updateByPrimaryKeyWithBLOBs(YwForumPost record);

    int updateByPrimaryKey(YwForumPost record);
}