package com.study.module.two;

import com.study.module.two.inter.impl.CurrentConditionsDisplay;
import com.study.module.two.inter.impl.WeatherData;

import java.util.Observable;
import java.util.Observer;

/**
 * @author liqc 2017/12/18.
 */
public class WeatherStation {
    public static void main(String[] args){

        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);


        weatherData.setMeasurements(80,65,30.4f);
        weatherData.setMeasurements(82,60,29.2f);
        weatherData.setMeasurements(78,90,29.2f);
    }
}
