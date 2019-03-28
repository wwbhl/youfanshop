package com.youfan.mapper;

import com.youfan.model.User;
import com.youfan.vo.UserVo;

import java.util.List;

public interface UserMapper {
    public void inseruserInfo(User user);
    public void updateUser(User user);
    public User findByUserid(int id);
    public List<User> queryuserbyvo(UserVo userVo);
    public void deleteuserbyid(int id);
}
