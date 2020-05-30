package com.aop.test.services;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
public class AopExampleDemo {

	
	public void sayHi()
	{
		System.out.println("hi");
	}
	
	public void sayBye()
	{
		System.out.println("Bye");
	}
}

@Aspect
@Configuration
class MyAspect {

	
	@Before("execution(* com.aop.test.services.AopExampleDemo.*(..))")
	public void before(JoinPoint joinPoint)
	{
		System.out.print("before! ");
		System.out.println(joinPoint.getSignature().getName());		
	}
	
	
}

