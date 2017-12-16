package com.study.module.one;

import com.study.module.one.entity.MallardDuck;

/**
 * @author liqc 2017/12/16.
 */
public class MiniDuckSimulator {
    public static void main(String[] args){

        MallardDuck mallardDuck = new MallardDuck();
        mallardDuck.performFly();
        mallardDuck.performQuack();
        mallardDuck.display();
    }
}
