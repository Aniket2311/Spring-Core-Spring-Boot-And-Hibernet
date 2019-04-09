package com.stpl.springdemo;

public class BaseballCoach implements Coach {

	private FortuneService fortuneService;
	
	public BaseballCoach() {}
	
	public BaseballCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Spend 30mins on batting practise";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
}
