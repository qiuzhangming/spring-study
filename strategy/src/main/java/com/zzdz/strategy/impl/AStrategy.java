package com.zzdz.strategy.impl;

import com.zzdz.strategy.MyStrategy;

public class AStrategy implements MyStrategy {
    @Override
    public void excute() {
        System.out.println("执行A策略。");
    }
}
