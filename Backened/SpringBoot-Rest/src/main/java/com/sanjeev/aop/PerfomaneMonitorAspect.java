package com.sanjeev.aop;

import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class PerfomaneMonitorAspect {
//    @Around("")
    private  static  final Logger LOGGER = LoggerFactory.getLogger(PerfomaneMonitorAspect.class);


    long startTime = System.currentTimeMillis();
    long endTime = System.currentTimeMillis();

}
