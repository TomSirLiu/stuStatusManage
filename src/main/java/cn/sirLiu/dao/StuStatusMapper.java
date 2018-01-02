package cn.sirLiu.dao;

import cn.sirLiu.model.StuStatus;
import cn.sirLiu.model.StuStatusExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface StuStatusMapper {
    int countByExample(StuStatusExample example);

    int deleteByExample(StuStatusExample example);

    int deleteByPrimaryKey(Integer stuStatusId);

    int insert(StuStatus record);

    int insertSelective(StuStatus record);

    List<StuStatus> selectByExample(StuStatusExample example);

    StuStatus selectByPrimaryKey(Integer stuStatusId);

    int updateByExampleSelective(@Param("record") StuStatus record, @Param("example") StuStatusExample example);

    int updateByExample(@Param("record") StuStatus record, @Param("example") StuStatusExample example);

    int updateByPrimaryKeySelective(StuStatus record);

    int updateByPrimaryKey(StuStatus record);
}