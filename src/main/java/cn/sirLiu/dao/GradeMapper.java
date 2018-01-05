package cn.sirLiu.dao;

import cn.sirLiu.model.Grade;
import cn.sirLiu.model.GradeExample;
import cn.sirLiu.model.GradeKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GradeMapper {
    int countByExample(GradeExample example);

    int deleteByExample(GradeExample example);

    int deleteByPrimaryKey(GradeKey key);

    int insert(Grade record);

    int insertSelective(Grade record);

    List<Grade> selectByExample(GradeExample example);

    Grade selectByPrimaryKey(GradeKey key);

    int updateByExampleSelective(@Param("record") Grade record, @Param("example") GradeExample example);

    int updateByExample(@Param("record") Grade record, @Param("example") GradeExample example);

    int updateByPrimaryKeySelective(Grade record);

    int updateByPrimaryKey(Grade record);
}