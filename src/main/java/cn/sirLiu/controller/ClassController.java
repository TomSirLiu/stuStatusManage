package cn.sirLiu.controller;

import cn.sirLiu.model.json.Msg;
import cn.sirLiu.service.ClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author sirLiu
 * @Date 2018/1/4 16:10
 */
@Controller
public class ClassController {

    @Autowired
    private ClassService classService;

    @RequestMapping(value = "/getAllClasses")
    @ResponseBody
    public String getAllClasses(){
        return Msg.success().add("classes",classService.getAllClasses()).toString();
    }

}
