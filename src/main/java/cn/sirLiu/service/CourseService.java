package cn.sirLiu.service;

import cn.sirLiu.dao.CourseMapper;
import cn.sirLiu.model.Course;
import cn.sirLiu.model.CourseExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author sirLiu
 * @Date 2018/1/4 15:50
 */
@Service
public class CourseService {

    @Autowired
    private CourseMapper courseMapper;

    public List<Course> getAllCourse(){
        return courseMapper.selectByExample(new CourseExample());
    }

    public Course selectCourseByID(Integer courseID){
        return courseMapper.selectByPrimaryKey(courseID);
    }

}
