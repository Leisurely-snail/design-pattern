package com.study.module.one.entity;

import com.study.module.one.inter.impl.FlyNoWay;
import com.study.module.one.inter.impl.Quack;

/**
 * 模型鸭
 * @author liqc 2017/12/16.
 */
public class ModelDuck extends Duck {

    public ModelDuck(){
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }
    public void display() {

        System.out.println("I`am a model duck");
    }
}
