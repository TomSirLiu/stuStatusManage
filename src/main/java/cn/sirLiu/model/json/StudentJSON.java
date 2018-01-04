package cn.sirLiu.model.json;

import cn.sirLiu.model.Class;
import cn.sirLiu.model.Manager;
import cn.sirLiu.model.StuStatus;
import cn.sirLiu.model.Student;
import cn.sirLiu.service.ClassService;
import cn.sirLiu.service.ManagerService;
import cn.sirLiu.service.StuStatusService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Author sirLiu
 * @Date 2018/1/4 11:56
 */
public class StudentJSON {

    Integer stuId;

    String stuName;

    Integer stuAge;

    String stuSex;

    String stuAddress;

    StuStatus stuStatus;

    Class stuClass;

    Manager manager;

    @Autowired
    private static StuStatusService stuStatusService;

    @Autowired
    private static ClassService classService;

    @Autowired
    private static ManagerService managerService;

    public static StudentJSON convertStudentToJSON(Student student) {
        StudentJSON studentJSON = new StudentJSON();
        studentJSON.stuId = student.getStuId();
        studentJSON.stuName = student.getStuName();
        studentJSON.stuAge = student.getStuAge();
        studentJSON.stuAddress = student.getStuAddress();
        studentJSON.stuSex = student.getStuSex();
        studentJSON.stuStatus = stuStatusService.selectStuStatusByID(student.getStuStatusId());
        studentJSON.stuClass = classService.selectClassByID(student.getStuClassId());
        studentJSON.manager = managerService.selectManagerByID(student.getManagerId());
        return studentJSON;
    }

}
