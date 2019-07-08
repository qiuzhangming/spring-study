package com.zzdz.strategy;

import java.util.HashMap;
import java.util.Map;

/**
 * @Classname MyStrategyFactory
 * @Description TODO
 * @Date 2019/7/8 12:50
 * @Created by joe
 */
public class MyStrategyFactory {
    private static MyStrategyFactory strategyFactory = new MyStrategyFactory();
    private static Map<Integer, MyStrategy> strategyMap = new HashMap<>();

    // 通过反射，加载所有的策略到hashMap中
    static {
        for (RefelCommandTypeEnum t : RefelCommandTypeEnum.values()) {
            try {
                Class clazz = Class.forName(t.clazz());
                strategyMap.put(t.command(), (MyStrategy) clazz.newInstance());

            } catch (ClassNotFoundException | InstantiationException | IllegalAccessException  e) {
                e.printStackTrace();
            }
        }
    }

    private MyStrategyFactory() {
    }

    public static MyStrategyFactory getInstance() {
        return strategyFactory;
    }

    public MyStrategy getStrategy(int command) {
        return strategyMap.get(command);
    }

}
