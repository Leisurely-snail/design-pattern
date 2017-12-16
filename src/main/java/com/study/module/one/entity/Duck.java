package com.study.module.one.entity;

import com.study.module.one.inter.FlyBehavior;
import com.study.module.one.inter.QuackBehavior;

/**
 * 鸭子超类
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

    //动态的指定行为
    public void setFlyBehavior(FlyBehavior flyBehavior) {

        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {

        this.quackBehavior = quackBehavior;
    }
}
