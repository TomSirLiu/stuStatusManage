package cn.sirLiu.controller;

import cn.sirLiu.model.Course;
import cn.sirLiu.model.json.Msg;
import cn.sirLiu.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import sun.misc.resources.Messages_sv;

import java.util.List;

/**
 * @Author sirLiu
 * @Date 2018/1/4 10:22
 */
@Controller
public class CourseController {

    @Autowired
    private CourseService courseService;

    @RequestMapping(value = "getAllCourses")
    @ResponseBody
    public String getAllCourses(){
        List<Course> courses= courseService.getAllCourse();
        return Msg.success().add("courses",courses).toString();
    }

}
