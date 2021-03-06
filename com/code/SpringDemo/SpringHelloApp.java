package com.code.SpringDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringHelloApp {
	
	public static void main(String[] args) {
		
		//load the configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve the bean from spring container
		
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		//call the methods on the bean
		System.out.println(theCoach.getDailyWorkOut());
		
		System.out.println(theCoach.getDailyFortune());
		//close the context
		context.close();
		
	}
}
