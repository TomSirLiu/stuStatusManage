package cn.sirLiu.controller;

import cn.sirLiu.model.Manager;
import cn.sirLiu.model.Student;
import cn.sirLiu.model.Teacher;
import cn.sirLiu.model.json.Msg;
import cn.sirLiu.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author sirLiu
 * @Date 2018/1/5 11:42
 */
@Controller
public class LoginController {

    @Autowired
    private LoginService loginService;

    private final String MANAGER = "manager";
    private final String STUDENT = "student";
    private final String TEACHER = "teacher";

    @RequestMapping(value = "/login")
    @ResponseBody
    public String login(@RequestParam(value = "loginType") String loginType,
                        @RequestParam(value = "loginName") String name,
                        @RequestParam(value = "loginPassword") String password) {
        if (loginType != null) {
            if (MANAGER.equals(loginType)) {
                Manager manager = loginService.loginManager(name, password);
                if (manager != null) {
                    return Msg.success().add("loginType", loginType).add("manager", manager).toString();
                }else{
                    return Msg.fail().add("error", "管理员用户名或密码错误").toString();
                }
            } else if (TEACHER.equals(loginType)) {
                Teacher teacher = loginService.loginTeacher(name, password);
                if (teacher != null) {
                    return Msg.success().add("loginType", loginType).add("teacher", teacher).toString();
                }else{
                    return Msg.fail().add("error", "教师账号用户名或密码错误").toString();
                }
            } else if (STUDENT.equals(loginType)) {
                Student student = loginService.loginStudent(name, password);
                if (student != null) {
                    return Msg.success().add("loginType", loginType).add("manager", student).toString();
                }else{
                    return Msg.fail().add("error", "学生账号用户名或密码错误").toString();
                }
            }
        }
        return Msg.fail().add("error", "未指定登陆身份").toString();
    }

}
