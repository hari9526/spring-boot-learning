package com.upgrad.greeting;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)

public class EnglishGreetingService implements GreetingService{

    private TimeService timeService;

    public TimeService getTimeService() {
        return timeService;
    }

    //Constructor injection
    @Autowired
    public EnglishGreetingService(@Qualifier("timeService24hourFormat") TimeService timeService) {
        this.timeService = timeService;
    }

    //Setter injection
    //Here also this works cuz we are injection dependency on here
    //So doesn't matter if we put in property or here in this case
    //@Autowired
    public void setTimeService(TimeService timeService) {
        this.timeService = timeService;
    }


    @Override
    public void greet(String name) {
        System.out.println("Hello, " + name);
    }
}
