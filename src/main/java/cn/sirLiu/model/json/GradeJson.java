package cn.sirLiu.model.json;

import cn.sirLiu.model.Class;
import cn.sirLiu.model.Course;
import cn.sirLiu.model.Student;

import java.util.Date;

/**
 * @Author sirLiu
 * @Date 2018/1/6 21:08
 */
public class GradeJson {

    private Date scheduleTime;

    private Integer grade;

    private Course course;

    private Student student;

    private Class stuClass;

    public Class getStuClass() {
        return stuClass;
    }

    public void setStuClass(Class stuClass) {
        this.stuClass = stuClass;
    }

    public Date getScheduleTime() {

        return scheduleTime;
    }

    public void setScheduleTime(Date scheduleTime) {
        this.scheduleTime = scheduleTime;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
