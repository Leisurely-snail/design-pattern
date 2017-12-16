package com.study.module.one.entity;

import com.study.module.one.inter.impl.FlyWithWings;
import com.study.module.one.inter.impl.Quack;

/**
 * @author liqc 2017/12/16.
 */
public class MallardDuck extends Duck {

    public MallardDuck(){
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }
    public void display() {

        System.out.println("I`m a real Mallard duck");
    }
}
