package com.yzl.controller;

import com.yzl.entity.delete;
import com.yzl.entity.msg;
import com.yzl.entity.renderList;
import com.yzl.service.impl.UserServiceImpl;
import com.yzl.service.impl.addServiceImpl;
import com.yzl.service.impl.deletelmpl;
import com.yzl.service.updateService;
import com.yzl.utils.msgFactoryImpl.msgFactory;
import com.yzl.utils.msgFactoryImpl.msgIndex;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin
public class UserController {

    @Autowired
    @Qualifier("UserServiceImpl")
    private UserServiceImpl userService;

    @Autowired
    private deletelmpl deleteService;

    @Autowired
    private addServiceImpl addServiceService;

    @Autowired
    private com.yzl.service.updateService updateService;

    @Autowired
    private com.yzl.service.getUserService getUserService;

    @GetMapping("/getAll")
    public List<renderList> renderList() {
        List<renderList> all = userService.getAll();
        return all;
    }

    @PostMapping("/getUser")
    public renderList getUser(@RequestBody Map name) {
        renderList user = getUserService.getUser(name.get("name").toString());
        return user;
    }

    @PostMapping("/add")
    public msg renderList(@RequestBody renderList body) {
        msg addMsg = addServiceService.addCommodity(body);
        return addMsg;
    }

    @PostMapping("/delete")
    public msg delete(@RequestBody delete body) {
        msg deleteMsg = deleteService.deleteCommodity(body.getId());
        return deleteMsg;
    }

    @PostMapping("/update")
    public msg delete(@RequestBody renderList body) {
        msg updateMsg = updateService.update(body);
        return updateMsg;
    }

}
