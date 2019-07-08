package com.zzdz.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Classname LogInterceptor
 * @Description
 *
 * 使用jdk的实现。
 * 一个增加日志功能的代理类
 *
 * @Date 2019/7/8 11:43
 * @Created by joe
 */
public class LogInterceptor implements InvocationHandler {
    //存放传来的被代理对象。也就是目标对象
    private Object target;

    public LogInterceptor() {
    }

    public LogInterceptor(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("日志开始.....");

        //执行被代理对象的方法。同时把被代理对象和参数传递过去。
        method.invoke(target,args);

        System.out.println("日志结束......");

        return null;
    }
}
