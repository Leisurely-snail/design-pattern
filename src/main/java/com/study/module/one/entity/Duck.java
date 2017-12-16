package com.study.module.one.entity;

import com.study.module.one.inter.FlyBehavior;
import com.study.module.one.inter.QuackBehavior;

/**
 * @author liqc 2017/12/16.
 */
public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;
    public abstract void  display();

    public void performQuack(){
        quackBehavior.quack();
    }

    public void performFly(){
        flyBehavior.fly();
    }

    public void swim(){

        System.out.println("All ducks float,even decoys");
    }
}
