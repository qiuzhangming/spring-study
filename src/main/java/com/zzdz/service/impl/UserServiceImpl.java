package com.zzdz.service.impl;

import com.zzdz.dao.UserDao;
import com.zzdz.entity.User;
import com.zzdz.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 * @Classname UserServiceImpl
 * @Description TODO
 * @Date 2019/7/8 11:37
 * @Created by joe
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public Integer addUser(User user) {
        return userDao.add(user);
    }
}
