package cn.sirLiu.controller;

import cn.sirLiu.model.StuStatus;
import cn.sirLiu.model.Student;
import cn.sirLiu.model.json.Msg;
import cn.sirLiu.model.json.StudentJson;
import cn.sirLiu.service.StuStatusService;
import cn.sirLiu.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @Author sirLiu
 * @Date 2018/1/4 11:25
 */
@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;

    @Autowired
    private StuStatusService stuStatusService;

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
                               @RequestParam("alterStuClassID") Integer stuClassID,
                               @RequestParam("alterStuManagerID") Integer stuManagerID) {
        Student student = studentService.selectStuByID(stuId);
        student.setStuId(stuId);
        student.setStuName(stuName);
        student.setStuAge(stuAge);
        student.setStuSex(stuSex);
        student.setStuAddress(stuAddress);
        student.setStuClassId(stuClassID);
        student.setManagerId(stuManagerID);
        studentService.updateStu(student);
        return "redirect:/page/alterStudentPage";
    }

    @RequestMapping(value = "/deleteStuByID")
    @ResponseBody
    public String deleteStuByID(@RequestParam(value = "deleteStuID") Integer stuID) {
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
            return Msg.success().add("student", studentService.convertStudentToJSON(student)).toString();
        } else {
            return Msg.fail().add("error", "找不到符合该学号的学生").toString();
        }
    }

    @RequestMapping(value = "/alterStuStatusByID")
    @ResponseBody
    public String alterStuStatusByID(@RequestParam(value = "alterStuID") Integer stuID,
                                     @RequestParam(value = "stuStatusID") Integer stuStatusID) {
        Student student = studentService.selectStuByID(stuID);
        if (student != null) {
            StuStatus stuStatus = stuStatusService.selectStuStatusByID(stuStatusID);
            if (stuStatus != null) {
                student.setStuStatusId(stuStatusID);
                studentService.updateStu(student);
                return Msg.success().toString();
            } else {
                return Msg.fail().add("error", "学生状态ID不存在！").toString();
            }
        } else {
            return Msg.fail().add("error", "找不到符合该学号的学生！").toString();
        }
    }

    @RequestMapping(value = "/selectStuByName")
    @ResponseBody
    public String selectStuByName(@RequestParam(value = "selectStuName") String stuName) {
        StudentJson student = studentService.convertStudentToJSON(studentService.selectStuByName(stuName));
        if (student != null) {
            return Msg.success().add("student", student).toString();
        } else {
            return Msg.fail().add("error", "找不到符合该姓名的学生").toString();
        }
    }

    @RequestMapping(value = "/queryStuByCondition")
    @ResponseBody
    public String queryStuByCondition(@RequestParam(value = "queryStuID", required = false) Integer stuID,
                                      @RequestParam(value = "queryStuName", required = false) String stuName,
                                      @RequestParam(value = "queryStuAge", required = false) Integer stuAge,
                                      @RequestParam(value = "queryStuSex", required = false) String stuSex) {
        List<Student> studentsTemp = studentService.selectAllStu();
        List<StudentJson> studentsJson = new CopyOnWriteArrayList<>();
        for (Student student : studentsTemp) {
            studentsJson.add(studentService.convertStudentToJSON(student));
        }
        if (stuID != null) {
            for (StudentJson json : studentsJson) {
                if (!json.getStuId().equals(stuID)) {
                    studentsJson.remove(json);
                }
            }
        }
        if (stuName != null && !stuName.equals("")) {
            for (StudentJson json : studentsJson) {
                if (!json.getStuName().equals(stuName)) {
                    studentsJson.remove(json);
                }
            }
        }
        if (stuAge != null) {
            for (StudentJson json : studentsJson) {
                if (!json.getStuAge().equals(stuAge)) {
                    studentsJson.remove(json);
                }
            }
        }
        if (stuSex != null && !stuSex.equals("") && !stuSex.equals("all")) {
            for (StudentJson json : studentsJson) {
                if (!json.getStuSex().equals(stuSex)) {
                    studentsJson.remove(json);
                }
            }
        }
        return Msg.success().add("queryStudents", studentsJson).toString();
    }

    @RequestMapping(value = "/selectAllStu")
    @ResponseBody
    public String selectAllStu() {
        List<Student> students = studentService.selectAllStu();
        List<StudentJson> studentsJson = new ArrayList<>();
        for (Student student : students) {
            studentsJson.add(studentService.convertStudentToJSON(student));
        }
        return Msg.success().add("allStudents", studentsJson).toString();
    }

}
