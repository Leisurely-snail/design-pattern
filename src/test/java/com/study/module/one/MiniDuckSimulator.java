package com.study.module.one;

import com.study.module.one.entity.Duck;
import com.study.module.one.entity.MallardDuck;
import com.study.module.one.entity.ModelDuck;
import com.study.module.one.inter.impl.FlyRocketPowered;

/**
 * 测试类
 * @author liqc 2017/12/16.
 */
public class MiniDuckSimulator {
    public static void main(String[] args){

        MallardDuck mallardDuck = new MallardDuck();
        mallardDuck.performFly();
        mallardDuck.performQuack();
        mallardDuck.display();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
