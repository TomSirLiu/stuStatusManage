package cn.sirLiu.service;

import cn.sirLiu.dao.StuStatusMapper;
import cn.sirLiu.model.StuStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author sirLiu
 * @Date 2018/1/4 12:03
 */
@Service
public class StuStatusService {

    @Autowired
    private StuStatusMapper stuStatusMapper;

    public StuStatus selectStuStatusByID(Integer stuStatusID){
        return stuStatusMapper.selectByPrimaryKey(stuStatusID);
    }
}
