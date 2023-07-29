package model;

import service.WeatherService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public enum WeatherTypeEnum {
    RAINY,CLOUDY,WINDY,SUNNY;

    public static WeatherTypeEnum getRandomWeather(){
        Random randomWeather = new Random();
        ArrayList<WeatherTypeEnum> weatherList = new ArrayList<>(Arrays.asList(WeatherTypeEnum.values()));
        int index = randomWeather.nextInt(4);
        return weatherList.get(index);
    }
}
