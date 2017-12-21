package com.study.module.two.inter.impl;

import java.util.Observable;

/**
 * 实现java自身的主题对像
 * @author liqc 2017/12/21.
 */
public class WeatherData2 extends Observable {
    private float temperature;
    private float humidity;
    private float pressure;

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

    public void measurementsChanged(){
        setChanged();
        notifyObservers();
    }

    public float getTemperature() {

        return temperature;
    }

    public float getHumidity() {

        return humidity;
    }

    public float getPressure() {

        return pressure;
    }
}
