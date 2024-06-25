package com.nt.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.service.ResidentOperationsService;


public class BeforeAdviceTest {

	public static void main(String[] args) {
		//create IOC container
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		//get proxy class obj ref
		ResidentOperationsService proxy=ctx.getBean("roService",ResidentOperationsService.class);
		//invoke the msg method
	
		try {
			String msg=proxy.arrangeLunchForGuest("HK Sir", 99999L,4);
			System.out.println(msg);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
