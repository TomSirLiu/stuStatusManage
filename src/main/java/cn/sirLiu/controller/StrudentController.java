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

    @RequestMapping(value = "/addStudent")
    public String addStudent(){
        StudentMapper ge = studentMapper;
        System.out.println(studentMapper);
        return "addStudent";
    }

    @RequestMapping(value = "/alterStudent")
    public String alterStudent(){
        StudentMapper ge = studentMapper;
        System.out.println(studentMapper);
        return "alterStudent";
    }

    @RequestMapping(value = "/selectAndDeleteStudent")
    public String selectAndDeleteStudent(){
        StudentMapper ge = studentMapper;
        System.out.println(studentMapper);
        return "selectAndDeleteStudent";
    }

    @RequestMapping(value = "/alterStuStatus")
    public String alterStuStatus(){
        StudentMapper ge = studentMapper;
        System.out.println(studentMapper);
        return "alterStuStatus";
    }

    @RequestMapping(value = "/importScore")
    public String importScore(){
        StudentMapper ge = studentMapper;
        System.out.println(studentMapper);
        return "importScore";
    }

    @RequestMapping(value = "/selectAndDeleteScore")
    public String selectAndDeleteScore(){
        StudentMapper ge = studentMapper;
        System.out.println(studentMapper);
        return "selectAndDeleteScore";
    }

    @RequestMapping(value = "/gradeStatisticsAndRanking")
    public String gradeStatisticsAndRanking(){
        StudentMapper ge = studentMapper;
        System.out.println(studentMapper);
        return "gradeStatisticsAndRanking";
    }

    @RequestMapping(value = "/chooseCourseWithClass")
    public String chooseCourseWithClass(){
        StudentMapper ge = studentMapper;
        System.out.println(studentMapper);
        return "chooseCourseWithClass";
    }
}
