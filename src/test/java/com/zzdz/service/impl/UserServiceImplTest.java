package com.zzdz.service.impl;

import com.zzdz.entity.User;
import com.zzdz.proxy.LogInterceptor;
import com.zzdz.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.lang.reflect.Proxy;

/**
 * @Classname UserServiceImplTest
 * @Description TODO
 * @Date 2019/7/8 11:40
 * @Created by joe
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceImplTest {

    @Autowired
    private UserService userService;

    /**
     * 测试jdk的动态代理
     */
    @Test
    public void addUser() {

        // 使用spring容器时，不能使用自己new的对象。否则userService里面不能注入dao。
        //UserService userService = new UserServiceImpl();

        // 1、生成一个代理类对象,代理类需要实现接口：InvocationHandler
        // 2、把被代理对象(userService)传过去。
        LogInterceptor logInterceptor = new LogInterceptor(userService);

        // 使用Proxy.newProxyInstance() 生成代理对象
        // 参数：1.被代理对象的类加载器 2.被代理对象的接口 3.代理类对象
        UserService userServiceProxy = (UserService) Proxy.newProxyInstance(userService.getClass().getClassLoader(),
                userService.getClass().getInterfaces(),
                logInterceptor);

        userServiceProxy.addUser(new User("joe",32,1));
    }

    /**
     * 测试spring的aop
     */
    @Test
    public void aopTest() {
        userService.addUser(new User("joe",32,1));
    }


}