package cn.sirLiu.model;

public class Class {
    private Integer classId;

    private Integer classGrade;

    private String className;

    public Class(Integer classId, Integer classGrade, String className) {
        this.classId = classId;
        this.classGrade = classGrade;
        this.className = className;
    }

    public Class() {
        super();
    }

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    public Integer getClassGrade() {
        return classGrade;
    }

    public void setClassGrade(Integer classGrade) {
        this.classGrade = classGrade;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className == null ? null : className.trim();
    }
}