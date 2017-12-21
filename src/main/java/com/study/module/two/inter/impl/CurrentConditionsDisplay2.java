package com.study.module.two.inter.impl;

import com.study.module.two.inter.DisplayElement;

import java.util.Observable;
import java.util.Observer;

/**
 * 实现java自身的观察者对象
 * @author liqc 2017/12/21.
 */
public class CurrentConditionsDisplay2 implements Observer,DisplayElement {

    private float temperature;
    private float humidity;
    private Observable observable;

    public CurrentConditionsDisplay2(Observable observable){
        this.observable = observable;
        observable.addObserver(this);
    }

    public void update(Observable o, Object arg) {
        if(o instanceof  WeatherData2){
            WeatherData2 weatherData2 = (WeatherData2)o;
            this.temperature = weatherData2.getTemperature();
            this.humidity = weatherData2.getHumidity();
            display();
        }
    }

    public void display() {
        System.out.println("Current conditions: "+temperature+"F degrees and "+humidity+"% humidity");
    }
}
