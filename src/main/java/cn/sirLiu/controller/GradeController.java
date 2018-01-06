package cn.sirLiu.controller;

import cn.sirLiu.dao.StudentMapper;
import cn.sirLiu.model.Grade;
import cn.sirLiu.model.json.Msg;
import cn.sirLiu.service.CourseService;
import cn.sirLiu.service.GradeService;
import cn.sirLiu.service.StuStatusService;
import cn.sirLiu.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

/**
 * @Author sirLiu
 * @Date 2018/1/4 10:21
 */
@Controller
public class GradeController {

    @Autowired
    private GradeService gradeService;

    @Autowired
    private StudentService studentService;

    @Autowired
    private CourseService courseService;

    @RequestMapping(value = "/importGrade")
    @ResponseBody
    public String importGrade(@RequestParam(value = "stuID") Integer stuID,
                              @RequestParam(value = "courseID") Integer courseID,
                              @RequestParam(value = "grade") Integer grade) {
        if (studentService.selectStuByID(stuID) == null) {
            return Msg.fail().add("error", "不存在该学号的学生").toString();
        } else if (courseService.selectCourseByID(courseID) == null) {
            return Msg.fail().add("error", "不存在该课程代码的课程").toString();
        } else {
            Grade gradeModel = new Grade(stuID, courseID, new Date(), grade);
            int result = gradeService.importGrade(gradeModel);
            if (result == 1) {
                return Msg.success().toString();
            } else {
                return Msg.fail().add("error", "添加课程成绩出错！！").toString();
            }
        }
    }

}
