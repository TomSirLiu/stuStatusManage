package cn.sirLiu.service;

import cn.sirLiu.dao.ClassMapper;
import cn.sirLiu.dao.CourseMapper;
import cn.sirLiu.dao.GradeMapper;
import cn.sirLiu.dao.StudentMapper;
import cn.sirLiu.model.Grade;
import cn.sirLiu.model.GradeExample;
import cn.sirLiu.model.GradeKey;
import cn.sirLiu.model.Student;
import cn.sirLiu.model.json.GradeJson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author sirLiu
 * @Date 2018/1/6 16:58
 */
@Service
public class GradeService {

    @Autowired
    private GradeMapper gradeMapper;

    @Autowired
    private StudentMapper studentMapper;

    @Autowired
    private CourseMapper courseMapper;

    @Autowired
    private ClassMapper classMapper;

    public int importGrade(Grade grade) {
        return gradeMapper.insert(grade);
    }

    public Grade selectGradeByStuIDAndCourseID(Integer stuID, Integer courseID) {
        GradeKey gradeKey = new GradeKey(stuID, courseID);
        return gradeMapper.selectByPrimaryKey(gradeKey);
    }

    public int updateGrade(Grade grade) {
        return gradeMapper.updateByPrimaryKey(grade);
    }

    public List<Grade> queryGradeWithStuID(Integer stuID) {
        GradeExample gradeExample = new GradeExample();
        gradeExample.createCriteria().andStuIdEqualTo(stuID);
        return gradeMapper.selectByExample(gradeExample);
    }

    public List<Grade> queryAllGrade(){
        return gradeMapper.selectByExample(new GradeExample());
    }

    public int deleteGrade(Integer stuID,Integer courseID){
        GradeKey gradeKey = new GradeKey(stuID,courseID);
        return gradeMapper.deleteByPrimaryKey(gradeKey);
    }

    public GradeJson convertGradeToJson(Grade grade) {
        GradeJson gradeJson = new GradeJson();
        gradeJson.setGrade(grade.getGrade());
        gradeJson.setScheduleTime(grade.getScheduleTime());
        Student student = studentMapper.selectByPrimaryKey(grade.getStuId());
        gradeJson.setStudent(student);
        gradeJson.setCourse(courseMapper.selectByPrimaryKey(grade.getCourseId()));
        gradeJson.setStuClass(classMapper.selectByPrimaryKey(student.getStuClassId()));
        return gradeJson;
    }

}
