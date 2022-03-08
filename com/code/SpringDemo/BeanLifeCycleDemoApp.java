package com.code.SpringDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {
	
	public static void main(String[] args) {
		
		// load the spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifeCycle-ApplicationContext.xml");
				
		//retreive the beans
		Coach coach = context.getBean("myCoach", Coach.class);
		
		System.out.println(coach.getDailyFortune());
		
		System.out.println(coach.getDailyWorkOut());
		
		context.close();
	}
}
