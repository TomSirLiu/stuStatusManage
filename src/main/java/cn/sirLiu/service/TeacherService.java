package cn.sirLiu.service;

import cn.sirLiu.dao.TeacherMapper;
import cn.sirLiu.model.Teacher;
import cn.sirLiu.model.TeacherExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author sirLiu
 * @Date 2018/1/5 12:21
 */
@Service
public class TeacherService {

    @Autowired
    private TeacherMapper teacherMapper;

    public Teacher selectTeacherByID(Integer teacherID) {
        return teacherMapper.selectByPrimaryKey(teacherID);
    }

    public Teacher selectTeacherByName(String teacherName) {
        TeacherExample teacherExample = new TeacherExample();
        teacherExample.createCriteria().andTeacherNameEqualTo(teacherName);
        return teacherMapper.selectByExample(teacherExample).get(0);
    }

}
