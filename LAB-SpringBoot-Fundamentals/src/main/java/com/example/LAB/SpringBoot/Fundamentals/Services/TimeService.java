package com.example.LAB.SpringBoot.Fundamentals.Services;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Service
public class TimeService {

    public static String get_current_time() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        return dtf.format(now);
    }

    public static String get_current_date() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDateTime now = LocalDateTime.now();
        return dtf.format(now);
    }

    public static String get_current_day() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("E");
        LocalDateTime now = LocalDateTime.now();
        return dtf.format(now);
    }
}
