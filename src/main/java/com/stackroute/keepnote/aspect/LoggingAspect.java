package com.stackroute.keepnote.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/* Annotate this class with @Aspect and @Component */

@Aspect
@Component
public class LoggingAspect {

	/*
	 * Write loggers for each of the methods of controller, any particular method
	 * will have all the four aspectJ annotation
	 * (@Before, @After, @AfterReturning, @AfterThrowing).
	 */
	
    @Before("execution(* com.stackroute.keepnote.controller.CategoryController.*(..))")
    public void logBeforeV1(JoinPoint joinpoint) {
    System.out.println("LoggingAspect.logBeforeV1() :" 
                           +joinpoint.getSignature().getName());
    }
    
    @After("execution(* com.stackroute.keepnote.controller.CategoryController.*(..))")
    public void logAfterV1(JoinPoint joinpoint) {
    System.out.println("LoggingAspect.logAfterV1() :" 
                           +joinpoint.getSignature().getName());
    }
    
    @AfterReturning("execution(* com.stackroute.keepnote.controller.CategoryController.*(..))")
    public void logAfterReturningV1(JoinPoint joinpoint) {
    System.out.println("LoggingAspect.logAfterReturningV1() :" 
                           +joinpoint.getSignature().getName());
    }
    
    @AfterThrowing("execution(* com.stackroute.keepnote.controller.CategoryController.*(..))")
    public void logAfterThrowingV1(JoinPoint joinpoint) {
    System.out.println("LoggingAspect.logAfterThrowingV1() :" 
                           +joinpoint.getSignature().getName());
    }
    
    
}
