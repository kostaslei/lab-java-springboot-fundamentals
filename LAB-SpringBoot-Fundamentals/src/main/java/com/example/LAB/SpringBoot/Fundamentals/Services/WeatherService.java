package com.example.LAB.SpringBoot.Fundamentals.Services;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Service
public class WeatherService {

    public WeatherService() {}

    public int get_current_temperature() {
        Random random = new Random();
        return random.nextInt(-10, 41);
    }

    public String get_current_conditions() {
        List<String> weather = Arrays.asList("Sunny", "Rainy", "Cloudy", "Windy");

        Random random = new Random();
        return weather.get(random.nextInt(weather.size()));
    }

    public int get_wind_speed() {
        Random random = new Random();
        return random.nextInt(0, 100);
    }
}
