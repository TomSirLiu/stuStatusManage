package cn.sirLiu.controller;

import cn.sirLiu.dao.StudentMapper;
import cn.sirLiu.model.Grade;
import cn.sirLiu.model.Student;
import cn.sirLiu.model.json.GradeJson;
import cn.sirLiu.model.json.Msg;
import cn.sirLiu.service.CourseService;
import cn.sirLiu.service.GradeService;
import cn.sirLiu.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

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

    /**
     * 录入或者修改成绩
     *
     * @param stuID    学生号
     * @param courseID 课程代码
     * @param grade    课程成绩
     * @return
     */
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
            Grade existGradeModel = gradeService.selectGradeByStuIDAndCourseID(stuID, courseID);
            if (existGradeModel != null) {
                existGradeModel.setGrade(grade);
                int result = gradeService.updateGrade(existGradeModel);
                if (result == 1) {
                    return Msg.success().add("successInfo", "修改课程成绩成功！！").toString();
                } else {
                    return Msg.fail().add("error", "修改课程成绩出错！！").toString();
                }
            } else {
                Grade gradeModel = new Grade(stuID, courseID, new Date(), grade);
                int result = gradeService.importGrade(gradeModel);
                if (result == 1) {
                    return Msg.success().add("successInfo", "添加课程成绩成功！！").toString();
                } else {
                    return Msg.fail().add("error", "添加课程成绩出错！！").toString();
                }
            }
        }
    }

    @RequestMapping(value = "/queryGradeWithStuID")
    @ResponseBody
    public String queryGradeWithStuID(@RequestParam(value = "stuID") Integer stuID) {
        if (stuID != null && studentService.selectStuByID(stuID) == null) {
            return Msg.fail().add("error", "查询不到该学生！！").toString();
        }
        List<Grade> grades;
        if (stuID == null) {
            grades = gradeService.queryAllGrade();
        } else {
            grades = gradeService.queryGradeWithStuID(stuID);
        }
        List<GradeJson> gradesJson = new ArrayList<>();
        for (Grade grade : grades) {
            gradesJson.add(gradeService.convertGradeToJson(grade));
        }
        return Msg.success().add("grades", gradesJson).toString();
    }

    @RequestMapping(value = "/queryGradeWithStuName")
    @ResponseBody
    public String queryGradeWithStuName(@RequestParam(value = "stuName") String stuName) {
        Student student = studentService.selectStuByName(stuName);
        if (stuName != null && student == null) {
            return Msg.fail().add("error", "查询不到该学生！！").toString();
        }
        List<Grade> grades = gradeService.queryGradeWithStuID(student.getStuId());
        List<GradeJson> gradesJson = new ArrayList<>();
        for (Grade grade : grades) {
            gradesJson.add(gradeService.convertGradeToJson(grade));
        }
        return Msg.success().add("grades", gradesJson).toString();
    }

    @RequestMapping(value = "/deleteGradeByKey")
    @ResponseBody
    public String deleteGradeByKey(@RequestParam(value = "stuID") Integer stuID,
                                   @RequestParam(value = "courseID") Integer courseID) {
        int result = gradeService.deleteGrade(stuID, courseID);
        if (result == 1) {
            return Msg.success().toString();
        } else {
            return Msg.fail().add("error", "删除成绩出错！！").toString();
        }
    }

    @RequestMapping(value = "/higherGradeFirst")
    @ResponseBody
    public String higherGradeFirst() {
        List<Map<String, Object>> grades = gradeService.higherGradeFirst();
        return Msg.success().add("grades", grades).toString();
    }

    @RequestMapping(value = "/groupByCourseID")
    @ResponseBody
    public String groupByCourseID(@RequestParam(value = "statisticsConditionId") Integer courseID) {
        List<Map<String, Object>> grades = gradeService.groupByCourseID(courseID);
        return Msg.success().add("grades", grades).toString();
    }

    @RequestMapping(value = "/groupByStudentID")
    @ResponseBody
    public String groupByStudentID(@RequestParam(value = "statisticsConditionId") Integer stuID) {
        List<Map<String, Object>> grades = gradeService.groupByStudentID(stuID);
        return Msg.success().add("grades", grades).toString();
    }

    @RequestMapping(value = "/groupBySumGrade")
    @ResponseBody
    public String groupBySumGrade() {
        List<Map<String, Object>> grades = gradeService.selectSumGradeByGroupStuID();
        return Msg.success().add("grades", grades).toString();
    }

}
