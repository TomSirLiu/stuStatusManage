package cn.sirLiu.model;

import java.util.Date;

public class Grade extends GradeKey {
    private Date scheduleTime;

    private Integer grade;

    public Grade(Integer stuId, Integer courseId, Date scheduleTime, Integer grade) {
        super(stuId, courseId);
        this.scheduleTime = scheduleTime;
        this.grade = grade;
    }

    public Grade() {
        super();
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
}