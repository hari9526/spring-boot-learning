package com.upgrad.greeting;

import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class TimeService24hourFormat implements  TimeService{
    @Override
    public int getCurrentTime() {
        return LocalDateTime.now().getHour();
    }
}
