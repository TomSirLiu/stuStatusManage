package cn.sirLiu.service;

import cn.sirLiu.dao.*;
import cn.sirLiu.model.*;
import cn.sirLiu.model.json.GradeJson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

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

    @Autowired
    private TeacherMapper teacherMapper;

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

    public List<Grade> queryAllGrade() {
        return gradeMapper.selectByExample(new GradeExample());
    }

    public int deleteGrade(Integer stuID, Integer courseID) {
        GradeKey gradeKey = new GradeKey(stuID, courseID);
        return gradeMapper.deleteByPrimaryKey(gradeKey);
    }

    public List<Map<String, Object>> selectSumGradeByGroupStuID() {
        return gradeMapper.selectSumGradeByGroupStuID();
    }

    public List<Map<String, Object>> higherGradeFirst() {
        return gradeMapper.selectGradeJson(null, null);
    }

    public List<Map<String, Object>> groupByCourseID(Integer courseID) {
        return gradeMapper.selectGradeJson(null, courseID);
    }

    public List<Map<String, Object>> groupByStudentID(Integer stuID) {
        return gradeMapper.selectGradeJson(stuID, null);
    }

    public Grade selectByGradeKey(Integer stuID, Integer courseID) {
        return gradeMapper.selectByPrimaryKey(new GradeKey(stuID, courseID));
    }

    public GradeJson convertGradeToJson(Grade grade) {
        GradeJson gradeJson = new GradeJson();
        gradeJson.setGrade(grade.getGrade());
        gradeJson.setScheduleTime(grade.getScheduleTime());
        Student student = studentMapper.selectByPrimaryKey(grade.getStuId());
        Course course = courseMapper.selectByPrimaryKey(grade.getCourseId());
        gradeJson.setStudent(student);
        gradeJson.setCourse(course);
        gradeJson.setStuClass(classMapper.selectByPrimaryKey(student.getStuClassId()));
        gradeJson.setTeacher(teacherMapper.selectByPrimaryKey(course.getTeacherId()));
        return gradeJson;
    }

}
