package com.example.AOPSpring.Boot;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class UserServiceAspect {
	@Before(value = "execution(* com.example.AOPSpring.Boot..*(..))")
	public void beforeAdvice(JoinPoint joinPoint){
		System.out.println("Before UserServiceAspect >>>>>>>>");
	}
	@After(value = "execution(* com.example.AOPSpring.Boot..*(..))")
	public void afterAdvice(JoinPoint joinPoint){
		System.out.println("After UserServiceAspect >>>>>>>>>");
	}

	@AfterReturning(value = "execution(* com.example.AOPSpring.Boot..*(..))")
	public void afterReturn(JoinPoint joinPoint){
		System.out.println("After Return UserServiceAspect >>>>>>>>>");
	}
	@Around(value = "execution(* com.example.AOPSpring.Boot..*(..))")
	public void aroundAdvice(ProceedingJoinPoint joinPoint){
		System.out.println("Around Advice UserServiceAspect >>>>>>>>>");
		try {
			joinPoint.proceed();
		}catch (Throwable e){
			System.out.println("Exception occured"+ e);
		}
	}
}
