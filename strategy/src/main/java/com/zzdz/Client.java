package com.zzdz;

import com.zzdz.exception.StrategyNotFoundException;
import com.zzdz.service.MyStrategyService;

/**
 * @Classname Client
 * @Description TODO
 * @Date 2019/7/8 12:45
 * @Created by joe
 */
public class Client {
    public static void main(String[] args) {
        MyStrategyService myStrategyService = new MyStrategyService();

        myStrategyService.excuteStrategy(1);
        myStrategyService.excuteStrategy(2);
        myStrategyService.excuteStrategy(3);
        myStrategyService.excuteStrategy(4);
        myStrategyService.excuteStrategy(5);

        try {
            myStrategyService.excuteStrategy(7);
        } catch (StrategyNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("over!");
    }
}
