package cn.sirLiu.service;

import cn.sirLiu.dao.ManagerMapper;
import cn.sirLiu.dao.StudentMapper;
import cn.sirLiu.dao.TeacherMapper;
import cn.sirLiu.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author sirLiu
 * @Date 2018/1/5 12:27
 */
@Service
public class LoginService {

    @Autowired
    private TeacherMapper teacherMapper;

    @Autowired
    private ManagerMapper managerMapper;

    @Autowired
    private StudentMapper studentMapper;

    private final String PASSWORD = "123456";

    public Teacher loginTeacher(String name,String password){
        TeacherExample teacherExample = new TeacherExample();
        teacherExample.createCriteria().andTeacherNameEqualTo(name);
        List<Teacher> teachers = teacherMapper.selectByExample(teacherExample);
        if(teachers!=null && teachers.size()!=0 && password.equals(PASSWORD)){
            return teachers.get(0);
        }else  {
            return  null;
        }
    }

    public Student loginStudent(String name, String password){
        StudentExample studentExample = new StudentExample();
        studentExample.createCriteria().andStuNameEqualTo(name);
        List<Student> students = studentMapper.selectByExample(studentExample);
        if(students!=null && students.size()!=0 && password.equals(PASSWORD)){
            return students.get(0);
        }else  {
            return  null;
        }
    }

    public Manager loginManager(String name, String password){
        ManagerExample managerExample = new ManagerExample();
        managerExample.createCriteria().andManagerNameEqualTo(name);
        List<Manager> managers = managerMapper.selectByExample(managerExample);
        if(managers!=null && managers.size()!=0 && password.equals(PASSWORD)){
            return managers.get(0);
        }else  {
            return  null;
        }
    }

}
