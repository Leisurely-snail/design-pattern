package com.study.module.two.inter;

/**
 * 观察者模式的观察者接口
 * @author liqc 2017/12/18.
 */
public interface Observer {

    /**
     * 这不是一个好的做法
     * @param temp
     *          温度
     * @param humidity
     *          湿度
     * @param pressure
     *          气压
     */
    public void update(float temp,float humidity,float pressure);
}
