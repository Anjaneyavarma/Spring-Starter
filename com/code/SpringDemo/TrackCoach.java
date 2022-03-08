package com.code.SpringDemo;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;
	
	
	
	public TrackCoach() {
		
	}

	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkOut() {
		// TODO Auto-generated method stub
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}
	
	// add init method
	public void doMyStartUpStuff() {
		System.out.println("Trackcoach: inside the doMyStartUpStuff method");
	}
	
	// add destroy method
	public void doDestroyUpStuff() {
		System.out.println("Trackcoach: Inside the doDestroyUpStuff method");
	}

}
