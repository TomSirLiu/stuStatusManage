package cn.sirLiu.service;

import cn.sirLiu.dao.ClassMapper;
import cn.sirLiu.dao.ManagerMapper;
import cn.sirLiu.dao.StuStatusMapper;
import cn.sirLiu.dao.StudentMapper;
import cn.sirLiu.model.Student;
import cn.sirLiu.model.StudentExample;
import cn.sirLiu.model.json.StudentJson;
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

    @Autowired
    private StuStatusMapper stuStatusMapper;

    @Autowired
    private ClassMapper classMapper;

    @Autowired
    private ManagerMapper managerMapper;

    public int addStudent(Student student) {
        return studentMapper.insert(student);
    }

    public Student selectStuByID(Integer stuID) {
        return studentMapper.selectByPrimaryKey(stuID);
    }

    public int deleteStuByID(Integer stuID) {
        return studentMapper.deleteByPrimaryKey(stuID);
    }

    public List<Student> selectAllStu() {
        return studentMapper.selectByExample(new StudentExample());
    }

    public int updateStu(Student student){
        return studentMapper.updateByPrimaryKey(student);
    }

    public StudentJson convertStudentToJSON(Student student) {
        StudentJson studentJSON = new StudentJson();
        studentJSON.setStuId(student.getStuId());
        studentJSON.setStuName(student.getStuName());
        studentJSON.setStuAge(student.getStuAge());
        studentJSON.setStuAddress(student.getStuAddress());
        studentJSON.setStuSex(student.getStuSex());
        studentJSON.setStuStatus(stuStatusMapper.selectByPrimaryKey(student.getStuStatusId()));
        studentJSON.setStuClass(classMapper.selectByPrimaryKey(student.getStuClassId()));
        studentJSON.setManager(managerMapper.selectByPrimaryKey(student.getManagerId()));
        return studentJSON;
    }

}
