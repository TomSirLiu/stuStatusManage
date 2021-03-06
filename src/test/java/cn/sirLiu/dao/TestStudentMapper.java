package cn.sirLiu.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Author sirLiu
 * @Date 2018/1/2 16:50
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-mybatis.xml"})
public class TestStudentMapper {

    @Autowired
    private StudentMapper studentMapper;

    @Test
    public void selectStudents(){
        System.out.println("studentMapper: "+studentMapper);
    }

}
