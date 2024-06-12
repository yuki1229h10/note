package com.example.AOPSample.aop;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

	//	@Before("execution(* com.example.AOPSample.service.TargetService.*(..))")
	public void beforeAdvice(JoinPoint joinPoint) {
		LocalDateTime startTime = LocalDateTime.now();
		String formattedTime = startTime.format(DateTimeFormatter.ofPattern("HH:mm:ss:SSS"));
		System.out.println("before");
		System.out.println("before method:" + joinPoint.getSignature());
		System.out.println("start method:" + formattedTime);
	}

	//	@After("execution(* com.example.AOPSample.service.TargetService.*(..))")
	public void afterAdvice(JoinPoint joinPoint) {
		LocalDateTime endTime = LocalDateTime.now();
		String formattedTime = endTime.format(DateTimeFormatter.ofPattern("HH:mm:ss:SSS"));
		System.out.println("after");
		System.out.println("after method:" + joinPoint.getSignature());
		System.out.println("end method:" + formattedTime);
	}

	@Around("execution(* com.example.AOPSample.service.TargetService.*(..))")
	public Object aroundAdvice(ProceedingJoinPoint joinPoint) throws Throwable {
		long startTime = System.currentTimeMillis();
		System.out.println("around:before");
		System.out.println("target");
		System.out.println("class:" + joinPoint.getSignature().getDeclaringTypeName());
		System.out.println("method:" + joinPoint.getSignature().getName());

		Object result = joinPoint.proceed();

		System.out.println("around:after");
		long elapsedTime = System.currentTimeMillis() - startTime;
		System.out.println("method execution time:" + elapsedTime);
		return result;
	}

}
