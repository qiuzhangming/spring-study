package com.zzdz.proxy;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @Classname TimeInterceptor
 * @Description
 *
 * 使用spring-aop实现一个切面
 *
 * @Date 2019/7/8 12:18
 * @Created by joe
 */

@Aspect
@Component
public class TimeInterceptor {

    /**
     * 定义一个Pointcut
     */
    @Pointcut("execution(public * com.zzdz.dao..*.*(..))")
    public void daoPointcut(){}


    /**
     * 方法执行前执行的代码。
     */
    @Before("daoPointcut()")
    public void beforeMethod(JoinPoint joinPoint) {
        System.out.println("Before: methord.");

//        System.out.println(Arrays.toString(joinPoint.getArgs()));
//        System.out.println(joinPoint.getSignature().getName());
//
//        Signature signature = joinPoint.getSignature();
//        MethodSignature methodSignature = (MethodSignature) signature;
//        String[] strings = methodSignature.getParameterNames();
//        System.out.println(Arrays.toString(strings));
    }

    /**
     * 方法执行后执行的代码
     */
    @After("daoPointcut()")
    public void afterMethord(JoinPoint joinPoint) {
        System.out.println("After: method.");
    }

    /**
     * 环绕方法
     * @param pjp
     * @return
     */
    @Around("daoPointcut()")
    public Object arround(ProceedingJoinPoint pjp) {
        System.out.println("Around:start Around.");
        long sTime = System.currentTimeMillis();

        Object o = null;
        try {
            o = pjp.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
            return o;
        }

//        System.out.println("Object:" + o.getClass());
//        System.out.println("pjp.getClass():" + pjp.getClass());
//        System.out.println("pjp.getThis().getClass():" + pjp.getThis().getClass());
//        System.out.println("pjp.getTarget().getClass():" + pjp.getTarget().getClass());

        System.out.println(pjp.getSignature().getName() + "_耗时：" + (System.currentTimeMillis() - sTime));
        System.out.println("Around:stop Around.");
        return o;
    }

}
