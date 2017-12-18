package com.study.module.two.inter;

/**
 * 观察者模式的主题对象
 * @author liqc 2017/12/18.
 */
public interface Subject {

    /**
     * 注册观察者
     * @param o
     */
    public void registerObserver(Observer o);

    /**
     * 移除观察者
     * @param o
     */
    public void removeObserver(Observer o);

    /**
     * 通知观察者
     */
    public void notifyObserver();
}
