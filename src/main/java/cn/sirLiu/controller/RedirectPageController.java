package cn.sirLiu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 这个控制器是专门用来跳转页面的
 * @Author sirLiu
 * @Date 2018/1/4 11:35
 */
@Controller
@RequestMapping(value = "/page")
public class RedirectPageController {

//    student

    @RequestMapping(value = {"/addStudentPage","/entry"})
    public String addStudentPage(){
        return "addStudent";
    }

    @RequestMapping(value = "/alterStudentPage")
    public String alterStudent(){
        return "alterStudent";
    }

    @RequestMapping(value = "/selectAndDeleteStudentPage")
    public String selectAndDeleteStudent(){
        return "selectAndDeleteStudent";
    }

    @RequestMapping(value = "/alterStuStatusPage")
    public String alterStuStatus(){
        return "alterStuStatus";
    }

//    course

    @RequestMapping(value = "/chooseCourseWithClassPage")
    public String chooseCourseWithClass(){
        return "chooseCourseWithClass";
    }

//    grade

    @RequestMapping(value = "/importGradePage")
    public String importGrade(){
        return "importGrade";
    }

    @RequestMapping(value = "/gradeStatisticsAndRankingPage")
    public String gradeStatisticsAndRanking(){
        return "gradeStatisticsAndRanking";
    }

    @RequestMapping(value = "/selectAndDeleteGradePage")
    public String selectAndDeleteGrade(){
        return "selectAndDeleteGrade";
    }


}
