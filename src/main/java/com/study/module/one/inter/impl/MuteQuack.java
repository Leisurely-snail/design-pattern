package com.study.module.one.inter.impl;

import com.study.module.one.inter.QuackBehavior;

/**
 * @author liqc 2017/12/16.
 */
public class MuteQuack implements QuackBehavior {

    public void quack() {

        System.out.println("<<Silence>>");
    }
}
