package com.code.SpringDemo;

public class BaseballCoach implements Coach {
	
	//define a private feild for the dependency
	private FortuneService fortuneService;
	
	//define a constructor for dependency Injection
	public BaseballCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkOut() {
		return "Spend 30 mins on batting practice";
	}

	@Override
	public String getDailyFortune() {
		//use my fortune service to get fortune
		return fortuneService.getFortune();
	}
	
//	public String getDailyWorkOut() {
//		return "Spend 30 mins on batting practice";
//	}
	
}
