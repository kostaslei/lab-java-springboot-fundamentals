package com.example.LAB.SpringBoot.Fundamentals.Controllers;

import com.example.LAB.SpringBoot.Fundamentals.Services.TimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.LocalDateTime;

@RestController
public class TimeController {
    private final TimeService timeService;

    public TimeController(TimeService timeService) {
        this.timeService = timeService;
    }

    @GetMapping("/time")
    public String get_current_time(){
        return timeService.get_current_time();
    }

    @GetMapping("/date")
    public String get_current_date(){
        return timeService.get_current_date();
    }

    @GetMapping("/day")
    public String get_current_day(){
        return timeService.get_current_day();
    }

    @GetMapping("/all")
    public String get_all(){
        return "Time: " + timeService.get_current_time() +"\n Date: " + timeService.get_current_date() + "\n Day: " + timeService.get_current_day();
    }

}
