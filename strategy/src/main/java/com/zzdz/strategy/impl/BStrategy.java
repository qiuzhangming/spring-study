package com.zzdz.strategy.impl;

import com.zzdz.strategy.MyStrategy;

public class BStrategy implements MyStrategy {
    @Override
    public void excute() {
        System.out.println("执行B策略。");
    }
}
