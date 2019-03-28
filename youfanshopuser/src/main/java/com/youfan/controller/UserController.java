package com.youfan.controller;

import com.youfan.model.User;
import com.youfan.service.UserService;
import com.youfan.vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


@Controller
public class UserController {
    @Autowired
    UserService userService;



    @RequestMapping(value = "/touserregister",method = RequestMethod.GET)
    public String touserregister(){
        return "userregister";
    }

    @RequestMapping(value = "/userregister",method = RequestMethod.POST)
    public void userregister(User user){
        userService.inseruserInfo(user);
        return;
    }

    @RequestMapping(value = "/toupdateUser",method = RequestMethod.GET)
    public String toupdateUser(int id, Model model){
        User user = userService.findByUserid(id);
        model.addAttribute("user", user);
        return "updateUser";
    }

    @RequestMapping(value = "/updateUser",method = RequestMethod.POST)
    public void updateUser(User user){
        userService.updateUser(user);
    }

    @RequestMapping(value = "/findByUserid",method = RequestMethod.GET)
    public String findByUserid(int id, Model model){
        User user = userService.findByUserid(id);
        model.addAttribute("user", user);
        return "userview";
    }
    @RequestMapping(value = "/queryuserbyvo",method = RequestMethod.GET)
    public String queryuserbyvo(Model model){

        UserVo userVo = new UserVo();
        List<User> listuser = userService.queryuserbyvo(userVo);
        model.addAttribute("listuser", listuser);
        return "userlist";
    }
    @RequestMapping(value = "/deleteuserbyid",method = RequestMethod.GET)
    public void deleteuserbyid(int id) {
        userService.deleteuserbyid(id);
    }
}
