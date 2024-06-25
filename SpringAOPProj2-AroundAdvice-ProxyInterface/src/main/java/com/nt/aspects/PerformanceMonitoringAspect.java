package com.nt.aspects;

import java.util.Arrays;
import java.util.Date;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component("pmAspect")
@Aspect
public class PerformanceMonitoringAspect {

	private long start,end;
	
	@Around("execution(double com.nt.service.IBankService.*(..))")
	public Object performence(ProceedingJoinPoint pjp)throws Throwable{
		//pre logics 
		start=System.currentTimeMillis();
		System.out.println(pjp.getSignature()+"with args"+Arrays.toString(pjp.getArgs())+"Has entered into b.method at"+new Date());
	    //invoke b.method/target method
		Object retVal=pjp.proceed();
		//post logics
		end=System.currentTimeMillis();
		System.out.println(pjp.getSignature()+"With args"+Arrays.toString(pjp.getArgs())+"has exited from b.method at"+new Date());
		System.out.println(pjp.getSignature()+"With args"+Arrays.toString(pjp.getArgs())+"has taken"+(end-start)+"ms to complete execution");
		
		return retVal;
	}
}
