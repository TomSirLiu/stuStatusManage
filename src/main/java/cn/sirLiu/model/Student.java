package cn.sirLiu.model;

public class Student {
    private Integer stuId;

    private String stuName;

    private Integer stuAge;

    private String stuSex;

    private String stuAddress;

    private Integer stuStatusId;

    private Integer stuClassId;

    private Integer managerId;

    public Student(Integer stuId, String stuName, Integer stuAge, String stuSex, String stuAddress, Integer stuStatusId, Integer stuClassId, Integer managerId) {
        this.stuId = stuId;
        this.stuName = stuName;
        this.stuAge = stuAge;
        this.stuSex = stuSex;
        this.stuAddress = stuAddress;
        this.stuStatusId = stuStatusId;
        this.stuClassId = stuClassId;
        this.managerId = managerId;
    }

    public Student() {
        super();
    }

    public Integer getStuId() {
        return stuId;
    }

    public void setStuId(Integer stuId) {
        this.stuId = stuId;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName == null ? null : stuName.trim();
    }

    public Integer getStuAge() {
        return stuAge;
    }

    public void setStuAge(Integer stuAge) {
        this.stuAge = stuAge;
    }

    public String getStuSex() {
        return stuSex;
    }

    public void setStuSex(String stuSex) {
        this.stuSex = stuSex == null ? null : stuSex.trim();
    }

    public String getStuAddress() {
        return stuAddress;
    }

    public void setStuAddress(String stuAddress) {
        this.stuAddress = stuAddress == null ? null : stuAddress.trim();
    }

    public Integer getStuStatusId() {
        return stuStatusId;
    }

    public void setStuStatusId(Integer stuStatusId) {
        this.stuStatusId = stuStatusId;
    }

    public Integer getStuClassId() {
        return stuClassId;
    }

    public void setStuClassId(Integer stuClassId) {
        this.stuClassId = stuClassId;
    }

    public Integer getManagerId() {
        return managerId;
    }

    public void setManagerId(Integer managerId) {
        this.managerId = managerId;
    }
}