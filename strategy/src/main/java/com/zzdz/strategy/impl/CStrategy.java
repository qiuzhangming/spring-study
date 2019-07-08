package com.zzdz.strategy.impl;

import com.zzdz.strategy.MyStrategy;

public class CStrategy implements MyStrategy {
    @Override
    public void excute() {
        System.out.println("执行C策略。");
    }
}
