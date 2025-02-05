package com.example.demo;



import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class DeviceLoggingAspect {
    @After("execution(* com.smart.home.service.DeviceService.toggleDeviceStatus(..))")
    public void logDeviceToggle() {
        System.out.println("Device status changed!");
    }
}

