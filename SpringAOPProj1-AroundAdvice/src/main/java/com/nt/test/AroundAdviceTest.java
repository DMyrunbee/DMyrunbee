package com.nt.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.service.BankService;

public class AroundAdviceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//create IOC container
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		//get proxy class object
		BankService service=ctx.getBean("bankService",BankService.class);
		System.out.println(service.getClass()+"-----"+service.getClass().getSuperclass());
		//invoke the b.methods
		try {
			System.out.println("Simple Interest amount::"+service.calcSimpleInterestAmount(100000, 2.0, 12.0));
			System.out.println("--------------------");
			System.out.println("Compound Interest Amount::"+service.calcCompoundInterestAmount(100000, 2.0, 12.0));
			
		}//try
		catch(Exception e) {
		     e.printStackTrace();
		}
		//close IOC Container
		ctx.close();
	}

}
