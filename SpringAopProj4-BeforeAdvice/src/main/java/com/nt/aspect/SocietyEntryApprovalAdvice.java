package com.nt.aspect;

import java.util.Scanner;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class SocietyEntryApprovalAdvice {

	@Before("execution(java.lang.String com.nt.service.ResidentOperationsService.arrange*(..))")
	public void approveForEntry(JoinPoint jp)throws Throwable{
		System.out.println("SocietyEntryApprovalAdvice.approveForEntry()");
		String guestName=(String) jp.getArgs()[0];
		System.out.println(guestName+"guest wants to take entry to u r flat do u want to Approve?(y/n)");
		System.out.println();
		Scanner sc=new Scanner(System.in);
		String reply=sc.next();
		if(reply.equalsIgnoreCase("no"))
			throw new IllegalArgumentException("entry is not approved by flat owner");
		
	}
}
