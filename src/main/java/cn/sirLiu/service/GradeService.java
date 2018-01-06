package cn.sirLiu.service;

import cn.sirLiu.dao.GradeMapper;
import cn.sirLiu.model.Grade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author sirLiu
 * @Date 2018/1/6 16:58
 */
@Service
public class GradeService {

    @Autowired
    private GradeMapper gradeMapper;

    public int importGrade(Grade grade){
        return gradeMapper.insert(grade);
    }

}
