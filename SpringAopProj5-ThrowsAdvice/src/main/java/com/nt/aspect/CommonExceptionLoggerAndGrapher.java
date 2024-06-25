package com.nt.aspect;

import java.io.FileWriter;
import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import com.nt.exception.InvalidInputsException;

@Component
@Aspect
public class CommonExceptionLoggerAndGrapher {

	@AfterThrowing(value="execution (java.lang.String com.nt.service.ShoppingStore.shopping(..))",throwing="e")
	public void exceptionLogging_Graphing(JoinPoint jp,Exception e)throws Throwable {
		System.out.println("CommonExceptionLoggerAndGrapher.exceptionLogging_Graphing()");
		//Exception logging
		String exceptionMsg=e+"exception is raised in"+jp.getSignature()+"with args"+Arrays.toString(jp.getArgs());
		FileWriter writer=new FileWriter("e:\\explog.txt",true);
		writer.write(exceptionMsg+"\n");
		writer.flush();
		writer.close();
		//Exception graphing
		throw new InvalidInputsException(e.getMessage());//converting raised exception to custom Exception
	}
}
