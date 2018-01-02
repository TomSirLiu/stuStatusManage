package cn.sirLiu.controller;

import cn.sirLiu.dao.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author coolj
 * 2018/1/2
 */
@Controller
public class StrudentController {

    @Autowired
    private StudentMapper studentMapper;

    @RequestMapping(value = "test")
    public String index(){
        StudentMapper ge = studentMapper;
        System.out.println(studentMapper);
        return "temp";
    }

}
