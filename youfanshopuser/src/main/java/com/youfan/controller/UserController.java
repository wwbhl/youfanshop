package com.youfan.controller;

import com.youfan.model.User;
import com.youfan.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("/getUserInfo")
    @ResponseBody
    public User getUserInfo(){
        User user = userService.findUserInfo();
        if(user !=null){
            System.out.println("user.getName():" + user.getName());
        }
        return user;
    }

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

    @RequestMapping(value = "updateUser",method = RequestMethod.POST)
    public void updateUser(User user){
        userService.updateUser(user);
    }

    @RequestMapping(value = "findByUserid",method = RequestMethod.GET)
    public String findByUserid(int id, Model model){
        User user = userService.findByUserid(id);
        model.addAttribute("user", user);
        return "userview";
    }
}
