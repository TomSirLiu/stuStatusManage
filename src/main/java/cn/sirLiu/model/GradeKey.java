package cn.sirLiu.model;

public class GradeKey {
    private Integer stuId;

    private Integer courseId;

    public GradeKey(Integer stuId, Integer courseId) {
        this.stuId = stuId;
        this.courseId = courseId;
    }

    public GradeKey() {
        super();
    }

    public Integer getStuId() {
        return stuId;
    }

    public void setStuId(Integer stuId) {
        this.stuId = stuId;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }
}