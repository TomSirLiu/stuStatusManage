package cn.sirLiu.service;

import cn.sirLiu.dao.StudentMapper;
import cn.sirLiu.model.Student;
import cn.sirLiu.model.StudentExample;
import cn.sirLiu.model.json.StudentJSON;
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

    @Autowired
    private StuStatusService stuStatusService;

    @Autowired
    private ClassService classService;

    @Autowired
    private ManagerService managerService;

    public StudentJSON convertStudentToJSON(Student student) {
        StudentJSON studentJSON = new StudentJSON();
        studentJSON.setStuId(student.getStuId());
        studentJSON.setStuName(student.getStuName());
        studentJSON.setStuAge(student.getStuAge());
        studentJSON.setStuAddress(student.getStuAddress());
        studentJSON.setStuSex(student.getStuSex());
        studentJSON.setStuStatus(stuStatusService.selectStuStatusByID(student.getStuStatusId()));
        studentJSON.setStuClass(classService.selectClassByID(student.getStuClassId()));
        studentJSON.setManager(managerService.selectManagerByID(student.getManagerId()));
        return studentJSON;
    }

}
