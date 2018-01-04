package cn.sirLiu.controller;

import cn.sirLiu.model.Student;
import cn.sirLiu.model.json.Msg;
import cn.sirLiu.model.json.StudentJSON;
import cn.sirLiu.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author sirLiu
 * @Date 2018/1/4 11:25
 */
@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "/addStudent")
    public String addStudent(@RequestParam("addStuID") Integer stuId,
                             @RequestParam("addStuName") String stuName,
                             @RequestParam("addStuAge") Integer stuAge,
                             @RequestParam("addStuSex") String stuSex,
                             @RequestParam("addStuAddress") String stuAddress,
                             @RequestParam("addStuStatusID") Integer stuStatusID,
                             @RequestParam("addStuClassID") Integer stuClassID,
                             @RequestParam("addStuManagerID") Integer stuManagerID) {
        Student student = new Student();
        student.setStuId(stuId);
        student.setStuName(stuName);
        student.setStuAge(stuAge);
        student.setStuSex(stuSex);
        student.setStuAddress(stuAddress);
        student.setStuStatusId(stuStatusID);
        student.setStuClassId(stuClassID);
        student.setManagerId(stuManagerID);
        studentService.addStudent(student);
        return "redirect:/page/addStudentPage";
    }

    @RequestMapping(value = "/alterStudent")
    public String alterStudent(@RequestParam("alterStuID") Integer stuId,
                             @RequestParam("alterStuName") String stuName,
                             @RequestParam("alterStuAge") Integer stuAge,
                             @RequestParam("alterStuSex") String stuSex,
                             @RequestParam("alterStuAddress") String stuAddress,
                             @RequestParam("alterStuStatusID") Integer stuStatusID,
                             @RequestParam("alterStuClassID") Integer stuClassID,
                             @RequestParam("alterStuManagerID") Integer stuManagerID) {
        Student student = studentService.selectStuByID(stuId);
        student.setStuId(stuId);
        student.setStuName(stuName);
        student.setStuAge(stuAge);
        student.setStuSex(stuSex);
        student.setStuAddress(stuAddress);
        student.setStuStatusId(stuStatusID);
        student.setStuClassId(stuClassID);
        student.setManagerId(stuManagerID);
        studentService.updateStu(student);
        return "redirect:/page/alterStudentPage";
    }

    @RequestMapping(value = "/deleteStuByID")
    @ResponseBody
    public String deleteStuByID(@RequestParam(value = "selectStuID") Integer stuID) {
        int result = studentService.deleteStuByID(stuID);
        if (result == 1) {
            return Msg.success().toString();
        } else {
            return Msg.fail().add("error", "删除学生基本信息出错").toString();
        }
    }

    @RequestMapping(value = "/selectStuByID")
    @ResponseBody
    public String selectStuByID(@RequestParam(value = "selectStuID") Integer stuID) {
        Student student = studentService.selectStuByID(stuID);
        if (student != null) {
            return Msg.success().add("student", student).toString();
        } else {
            return Msg.fail().add("error", "找不到符合该学号的学生").toString();
        }
    }

    @RequestMapping(value = "/selectAllStu")
    @ResponseBody
    public String selectAllStu() {
        List<Student> students = studentService.selectAllStu();
        List<StudentJSON> studentJSONS = new ArrayList<>();
        for (Student student : students) {
            studentJSONS.add(studentService.convertStudentToJSON(student));
        }
        return Msg.success().add("allStudents", studentJSONS).toString();
    }

}
