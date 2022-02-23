package com.upgrad.greeting;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EnglishGreetingService implements GreetingService{
    @Autowired
    private TimeService timeService;

    public TimeService getTimeService() {
        return timeService;
    }

    public void setTimeService(TimeService timeService) {
        this.timeService = timeService;
    }


    @Override
    public void greet(String name) {
        System.out.println("Hello, " + name);
    }
}
