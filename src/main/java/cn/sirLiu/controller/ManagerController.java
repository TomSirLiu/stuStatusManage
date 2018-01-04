package cn.sirLiu.controller;

import cn.sirLiu.model.Manager;
import cn.sirLiu.model.json.Msg;
import cn.sirLiu.service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Author sirLiu
 * @Date 2018/1/4 15:54
 */
@Controller
public class ManagerController {

    @Autowired
    private ManagerService managerService;

    @RequestMapping(value = "getAllManagers")
    @ResponseBody
    public String getAllManagers() {
        List<Manager> managers = managerService.getAllManagers();
        return Msg.success().add("managers", managers).toString();
    }

}
