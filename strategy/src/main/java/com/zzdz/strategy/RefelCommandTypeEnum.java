package com.zzdz.strategy;

public enum RefelCommandTypeEnum {
    A_STRATEGY(1, "com.zzdz.strategy.impl.AStrategy"),
    B_STRATEGY(2, "com.zzdz.strategy.impl.BStrategy"),
    C_STRATEGY(3, "com.zzdz.strategy.impl.CStrategy"),
    D_STRATEGY(4, "com.zzdz.strategy.impl.DStrategy"),
    E_STRATEGY(5, "com.zzdz.strategy.impl.DStrategy"),
    ;

    private int command;
    private String clazz;

    RefelCommandTypeEnum(int command, String clazz) {
        this.command = command;
        this.clazz = clazz;
    }

    public int command() {
        return command;
    }

    public String clazz() {
        return clazz;
    }
}
