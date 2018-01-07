package cn.sirLiu.controller;

import cn.sirLiu.model.Teacher;
import cn.sirLiu.model.json.Msg;
import cn.sirLiu.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author sirLiu
 * @Date 2018/1/7 16:00
 */
@Controller
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    @RequestMapping(value = "/selectByTeacherName")
    @ResponseBody
    public String selectByTeacherName(@RequestParam(value = "teacherName") String teacherName) {
        Teacher teacher = teacherService.selectTeacherByName(teacherName);
        if (teacher == null) {
            return Msg.fail().add("error", "查询不到该教师").toString();
        } else {
            return Msg.success().add("teacher", teacher).toString();
        }
    }

}
