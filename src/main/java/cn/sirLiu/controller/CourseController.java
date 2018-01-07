package cn.sirLiu.controller;

import cn.sirLiu.model.Course;
import cn.sirLiu.model.Grade;
import cn.sirLiu.model.Student;
import cn.sirLiu.model.json.Msg;
import cn.sirLiu.service.CourseService;
import cn.sirLiu.service.GradeService;
import cn.sirLiu.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import sun.misc.resources.Messages_sv;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @Author sirLiu
 * @Date 2018/1/4 10:22
 */
@Controller
public class CourseController {

    @Autowired
    private CourseService courseService;

    @Autowired
    private StudentService studentService;

    @Autowired
    private GradeService gradeService;

    @RequestMapping(value = "/getAllCourses")
    @ResponseBody
    public String getAllCourses(){
        List<Course> courses= courseService.getAllCourse();
        return Msg.success().add("courses",courses).toString();
    }

    @RequestMapping(value = "/chooseCourseWithClass")
    @ResponseBody
    public String chooseCourseWithClass(@RequestParam(value = "classID")Integer classID,
                                        @RequestParam(value = "courseID")Integer courseID){
        List<Student> students = studentService.selectStudentsByClassID(classID);
        List<String> repeatChooseCourseStudentsName = new ArrayList<>();
        for(Student student:students){
            if(gradeService.selectByGradeKey(student.getStuId(),courseID)==null) {
                Grade grade = new Grade(student.getStuId(), courseID, new Date(), null);
                gradeService.importGrade(grade);
            }else{
                repeatChooseCourseStudentsName.add(student.getStuName());
            }
        }
        if(repeatChooseCourseStudentsName.size()==0) {
            return Msg.success().toString();
        }else{
            return Msg.fail().add("error","班级选课成功，但以下学生已经选过该课程").add("repeatStudentsName",repeatChooseCourseStudentsName).toString();
        }
    }

}
