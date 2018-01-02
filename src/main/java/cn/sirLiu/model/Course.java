package cn.sirLiu.model;

public class Course {
    private Integer courseId;

    private String courseName;

    private Integer courseTopLimit;

    private String courseType;

    private Integer teacherId;

    public Course(Integer courseId, String courseName, Integer courseTopLimit, String courseType, Integer teacherId) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.courseTopLimit = courseTopLimit;
        this.courseType = courseType;
        this.teacherId = teacherId;
    }

    public Course() {
        super();
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName == null ? null : courseName.trim();
    }

    public Integer getCourseTopLimit() {
        return courseTopLimit;
    }

    public void setCourseTopLimit(Integer courseTopLimit) {
        this.courseTopLimit = courseTopLimit;
    }

    public String getCourseType() {
        return courseType;
    }

    public void setCourseType(String courseType) {
        this.courseType = courseType == null ? null : courseType.trim();
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }
}