package com.zzdz.exception;

import lombok.Data;

@Data
public class StrategyNotFoundException extends RuntimeException {

    private int command;

    public StrategyNotFoundException(int command) {
        super("没有找到。");
        this.command = command;
    }
}
