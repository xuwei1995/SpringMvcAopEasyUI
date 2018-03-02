package com.zp.test.service.impl;

import com.zp.test.domain.User;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface UserServiceImpl {

    List<User> getUser(User user);

    void addUser(User user);

    void editUser(User user);

    void delUser(User user);
}
