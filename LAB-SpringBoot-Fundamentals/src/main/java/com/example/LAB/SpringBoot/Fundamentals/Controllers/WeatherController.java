package com.example.LAB.SpringBoot.Fundamentals.Controllers;

import com.example.LAB.SpringBoot.Fundamentals.Services.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/weather")
public class WeatherController {
    private WeatherService weatherService;

    public WeatherController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    @GetMapping("/temperature")
    public int get_current_temperature(){
        return weatherService.get_current_temperature();
    }

    @GetMapping("/condition")
    public String get_current_condition(){
        return weatherService.get_current_conditions();
    }

    @GetMapping("/wind")
    public int get_current_wind(){
        return weatherService.get_wind_speed();
    }

    @GetMapping("/all")
    public String get_current_all(){
        return "Temperature: "+weatherService.get_current_temperature() + "\nCurrent conditions: " + weatherService.get_current_conditions() + "\nWind speed: " + weatherService.get_wind_speed() ;
    }

}
