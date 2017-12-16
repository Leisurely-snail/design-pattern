package com.study.module.one.inter.impl;

import com.study.module.one.inter.FlyBehavior;

/**
 * @author liqc 2017/12/16.
 */
public class FlyNoWay implements FlyBehavior {

    public void fly() {

        System.out.println("I can`t fly");
    }
}
