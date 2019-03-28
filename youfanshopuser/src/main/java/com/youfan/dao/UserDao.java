package com.youfan.dao;

import com.youfan.mapper.UserMapper;
import com.youfan.model.User;
import com.youfan.vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserDao {

    @Autowired
    UserMapper userMapper;

    public void inseruserInfo(User user) {
        userMapper.inseruserInfo(user);
    }

    public void updateUser(User user) {
        userMapper.updateUser(user);
    }

    public User findByUserid(int id) {
        return userMapper.findByUserid(id);
    }

    public List<User> queryuserbyvo(UserVo userVo) {
        return userMapper.queryuserbyvo(userVo);
    }

    public void deleteuserbyid(int id) {
        userMapper.deleteuserbyid(id);
    }
}

