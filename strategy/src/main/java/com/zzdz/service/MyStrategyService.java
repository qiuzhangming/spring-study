package com.zzdz.service;

import com.zzdz.exception.StrategyNotFoundException;
import com.zzdz.strategy.MyStrategy;
import com.zzdz.strategy.MyStrategyFactory;
import lombok.extern.slf4j.Slf4j;

import java.util.Objects;


@Slf4j
public class MyStrategyService {

    private MyStrategy strategy;

    public void excuteStrategy(int command) throws StrategyNotFoundException {

        strategy = MyStrategyFactory.getInstance().getStrategy(command);

        if (Objects.isNull(strategy)) {
            throw new StrategyNotFoundException(command);
        }

        strategy.excute();
    }

}
