package com.study.module.two.inter.impl;

import com.study.module.two.inter.Observer;
import com.study.module.two.inter.Subject;

import java.util.ArrayList;

/**
 * @author liqc 2017/12/18.
 */
public class WeatherData implements Subject {

    private ArrayList<Observer> observers ;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData(){
        observers = new ArrayList<Observer>();
    }

    /**
     * 注册
     * @param o
     */
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    /**
     * 删除
     * @param o
     */
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if(i > 0){
            observers.remove(o);
        }
    }

    /**
     * 通知观察者
     */
    public void notifyObserver() {
        for(int i = 0; i < observers.size(); i++){
            Observer observer = observers.get(i);
            observer.update(temperature,humidity,pressure);
        }
    }

    public void measurementsChanged(){
        notifyObserver();
    }

    /**
     * 设置气象值
     * @param temperature
     * @param humidity
     * @param pressure
     */
    public void setMeasurements(float temperature,float humidity,float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    //其他方法
}
