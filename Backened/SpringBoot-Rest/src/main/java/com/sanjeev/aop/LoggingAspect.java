package com.sanjeev.aop;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

    private static  final Logger LOGGER = LoggerFactory.getLogger(LoggingAspect.class);

    // return type , class name ,args




//    @Before("execution(* *.*(..))")
    public  void logMethodCall( JoinPoint joinPoint) {

        LOGGER.info("Method call" + joinPoint.getSignature().getName());

    }

}
