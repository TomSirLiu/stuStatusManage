package cn.sirLiu.model;

public class StuStatus {
    private Integer stuStatusId;

    private String stuStatusName;

    public StuStatus(Integer stuStatusId, String stuStatusName) {
        this.stuStatusId = stuStatusId;
        this.stuStatusName = stuStatusName;
    }

    public StuStatus() {
        super();
    }

    public Integer getStuStatusId() {
        return stuStatusId;
    }

    public void setStuStatusId(Integer stuStatusId) {
        this.stuStatusId = stuStatusId;
    }

    public String getStuStatusName() {
        return stuStatusName;
    }

    public void setStuStatusName(String stuStatusName) {
        this.stuStatusName = stuStatusName == null ? null : stuStatusName.trim();
    }
}