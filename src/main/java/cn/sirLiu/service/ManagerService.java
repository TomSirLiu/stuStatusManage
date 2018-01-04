package cn.sirLiu.service;

import cn.sirLiu.dao.ManagerMapper;
import cn.sirLiu.model.Manager;
import cn.sirLiu.model.ManagerExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author sirLiu
 * @Date 2018/1/4 12:07
 */
@Service
public class ManagerService {

    @Autowired
    private ManagerMapper managerMapper;

    public Manager selectManagerByID(Integer managerID){
        return managerMapper.selectByPrimaryKey(managerID);
    }

    public List<Manager> getAllManagers (){
        return managerMapper.selectByExample(new ManagerExample());
    }

}
