package com.zzdz.dao.impl;

import com.zzdz.dao.UserDao;
import com.zzdz.entity.User;
import org.springframework.stereotype.Service;

/**
 * @Classname UserDaoImpl
 * @Description TODO
 * @Date 2019/7/8 11:36
 * @Created by joe
 */
@Service
public class UserDaoImpl implements UserDao {

    @Override
    public Integer add(User user) {
        System.out.println("保存了一个用户:"+user);
        return 1;
    }
}
