package com.nt.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.service.ShoppingStore;

public class ThrowsAdviceTest {

	public static void main(String[] args) {


		//create ioc container
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		//get proxy object ref
		ShoppingStore proxy=ctx.getBean("shopping",ShoppingStore.class);
		//invole the b.method
		try {
			String result=proxy.shopping(new String[] {"shirt","trouser","shoe"}, 
					                     new double[] {5000.0,7000.0,3000.0});
			System.out.println(result);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("--------------------");
		try {
			String result=proxy.shopping(new String[] {"shirt","trouser","shoe"}, 
					                     null);
			System.out.println(result);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("--------------------");
	}

}
