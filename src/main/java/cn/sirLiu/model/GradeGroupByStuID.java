package cn.sirLiu.model;

/**
 * @Author sirLiu
 * @Date 2018/1/7 0:46
 */
public class GradeGroupByStuID {

    private Integer totalScore;

    private Integer stuId;

    private Integer courseId;

    public GradeGroupByStuID() {
        super();
    }

    public GradeGroupByStuID(Integer stuId, Integer courseId) {
        this.stuId = stuId;
        this.courseId = courseId;
    }

    public Integer getTotalScore() {
        return totalScore;
    }

    public void setTotalScore(Integer totalScore) {
        this.totalScore = totalScore;
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
