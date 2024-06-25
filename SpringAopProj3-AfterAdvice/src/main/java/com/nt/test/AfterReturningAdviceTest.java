package com.nt.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.service.ShoppingStore;

public class AfterReturningAdviceTest {

	public static void main(String[] args) {
		//create IOC Container
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		//get spring bean class object
		ShoppingStore store=ctx.getBean("store",ShoppingStore.class);
		//invoke the b.method
		try {
			double billamount=store.shopping(new String[] {"shirt","trouser","shoe"},
					                         new double[] {90000.0,6000.0,3000.0});
			System.out.println("BillAmount::"+billamount);
		}catch(Exception se) {
			se.printStackTrace();
		}
           ctx.close();
		
	}

}
