package cn.sirLiu.service;

import cn.sirLiu.dao.StudentMapper;
import cn.sirLiu.model.Student;
import cn.sirLiu.model.StudentExample;
import jdk.nashorn.internal.ir.IdentNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

/**
 * @Author sirLiu
 * @Date 2018/1/4 10:26
 */
@Controller
public class StudentService {

    @Autowired
    private StudentMapper studentMapper;

    public int addStudent(Student student){
        return studentMapper.insert(student);
    }

    public Student selectStuByID(Integer stuID){
        return studentMapper.selectByPrimaryKey(stuID);
    }

    public int deleteStuByID(Integer stuID){
        return studentMapper.deleteByPrimaryKey(stuID);
    }

    public List<Student> selectAllStu(){
        return studentMapper.selectByExample(new StudentExample());
    }

}
