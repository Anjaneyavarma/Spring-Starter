package com.code.SpringDemo;

public class MyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Create the object
//		BaseballCoach obj = new BaseballCoach();
		
		Coach coach = new TrackCoach();
		
		//Access the object
		System.out.println(coach.getDailyWorkOut());

	}

}
