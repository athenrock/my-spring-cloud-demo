package com.my.eureka.service.feign.service;

import org.springframework.stereotype.Component;

@Component
public class ScheduleServiceHiHystrix implements ScheduleServiceHi {

    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}
