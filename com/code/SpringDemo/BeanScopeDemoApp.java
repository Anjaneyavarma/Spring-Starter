package com.code.SpringDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {
	
	public static void main(String[] args) {
		
		// load the spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-ApplicationContext.xml");
		
		//retreive the beans
		Coach coach = context.getBean("myCoach", Coach.class);
		
		Coach alphaCoach = context.getBean("myCoach", Coach.class);
		
		//Singleton, check if they are same or not
		boolean result = coach == alphaCoach;
		
		System.out.println("\n Pointing to the same object "+ result);
		
		System.out.println("\n memory Location for the coach "+ coach);
		
		System.out.println("\n memory Location for the alphaCoach "+ alphaCoach);
		
		Coach prototypeCoach = context.getBean("myPrototypeCoach", Coach.class);
		
		Coach alphaPrototypeCoach = context.getBean("myPrototypeCoach", Coach.class);
		
		//Prototype, check if they are same or not
		boolean prototypeResult = coach == alphaCoach;
		
		System.out.println("\n Pointing to the same object "+ prototypeResult);
		
		System.out.println("\n memory Location for the coach "+ prototypeCoach);
		
		System.out.println("\n memory Location for the alphaCoach "+ alphaPrototypeCoach);
		
		context.close();
		
		context.close();
	}

}
