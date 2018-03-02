package com.zp.test.service;

import com.zp.test.domain.User;
import com.zp.test.mapper.UserMapper;
import com.zp.test.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements UserServiceImpl {
    @Autowired
    UserMapper userMapper;

    @Override
    public List<User> getUser(User user) {
        return userMapper.getUser(user);
    }

    @Override
    public void addUser(User user) {
        userMapper.insertSelective(user);
    }

    @Override
    public void editUser(User user) {
        userMapper.updateByPrimaryKeySelective(user);
    }

    @Override
    public void delUser(User user) {
        userMapper.deleteByPrimaryKey(user.getUserId());
    }
}
