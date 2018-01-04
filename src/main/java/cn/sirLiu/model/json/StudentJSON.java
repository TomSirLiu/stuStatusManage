package cn.sirLiu.model.json;

import cn.sirLiu.model.Class;
import cn.sirLiu.model.Manager;
import cn.sirLiu.model.StuStatus;
import cn.sirLiu.model.Student;
import cn.sirLiu.service.ClassService;
import cn.sirLiu.service.ManagerService;
import cn.sirLiu.service.StuStatusService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Author sirLiu
 * @Date 2018/1/4 11:56
 */
public class StudentJSON {

    private Integer stuId;

    private String stuName;

    private Integer stuAge;

    private String stuSex;

    private String stuAddress;

    private StuStatus stuStatus;

    private Class stuClass;

    private Manager manager;

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
        this.stuName = stuName;
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
        this.stuSex = stuSex;
    }

    public String getStuAddress() {
        return stuAddress;
    }

    public void setStuAddress(String stuAddress) {
        this.stuAddress = stuAddress;
    }

    public StuStatus getStuStatus() {
        return stuStatus;
    }

    public void setStuStatus(StuStatus stuStatus) {
        this.stuStatus = stuStatus;
    }

    public Class getStuClass() {
        return stuClass;
    }

    public void setStuClass(Class stuClass) {
        this.stuClass = stuClass;
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }
}
