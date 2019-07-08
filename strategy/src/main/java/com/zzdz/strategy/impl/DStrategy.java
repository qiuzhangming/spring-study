package com.zzdz.strategy.impl;

import com.zzdz.strategy.MyStrategy;

public class DStrategy implements MyStrategy {
    @Override
    public void excute() {
        System.out.println("执行D策略。");
    }
}
