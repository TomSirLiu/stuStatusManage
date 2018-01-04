package cn.sirLiu.service;

import cn.sirLiu.dao.ClassMapper;
import cn.sirLiu.model.Class;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author sirLiu
 * @Date 2018/1/4 12:06
 */
@Service
public class ClassService {

    @Autowired
    private ClassMapper classMapper;

    public Class selectClassByID(Integer classID){
        return classMapper.selectByPrimaryKey(classID);
    }

}
