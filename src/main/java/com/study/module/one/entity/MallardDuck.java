package com.study.module.one.entity;

import com.study.module.one.inter.impl.FlyWithWings;
import com.study.module.one.inter.impl.Quack;

/**
 * 绿头鸭
 * @author liqc 2017/12/16.
 */
public class MallardDuck extends Duck {

    //实例化中写死鸭子的行为，可以通过set方法动态的设置行为
    public MallardDuck(){
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }
    public void display() {

        System.out.println("I`m a real Mallard duck");
    }
}
