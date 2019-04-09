package com.stpl.springdemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;

	public CricketCoach() {
		System.out.println("CricketCoach: Inside No-args constructor");;
	}

	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach: Inside setter method - setFortuneService");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Practise fast bowling for 15mins daily";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
