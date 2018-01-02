package cn.sirLiu.model;

import java.util.Date;

public class Teacher {
    private Integer teacherId;

    private String teacherName;

    private Integer teacherLevel;

    private String teacherType;

    private Date teacherEntryTime;

    public Teacher(Integer teacherId, String teacherName, Integer teacherLevel, String teacherType, Date teacherEntryTime) {
        this.teacherId = teacherId;
        this.teacherName = teacherName;
        this.teacherLevel = teacherLevel;
        this.teacherType = teacherType;
        this.teacherEntryTime = teacherEntryTime;
    }

    public Teacher() {
        super();
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName == null ? null : teacherName.trim();
    }

    public Integer getTeacherLevel() {
        return teacherLevel;
    }

    public void setTeacherLevel(Integer teacherLevel) {
        this.teacherLevel = teacherLevel;
    }

    public String getTeacherType() {
        return teacherType;
    }

    public void setTeacherType(String teacherType) {
        this.teacherType = teacherType == null ? null : teacherType.trim();
    }

    public Date getTeacherEntryTime() {
        return teacherEntryTime;
    }

    public void setTeacherEntryTime(Date teacherEntryTime) {
        this.teacherEntryTime = teacherEntryTime;
    }
}