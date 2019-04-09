package com.stpl.springdemo;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;
	
	public TrackCoach() {
		super();
	}

	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		return "Track Coach ---->>> " + fortuneService.getFortune();
	}
	
	public void m1() {
		System.out.println("Inside m1 of TrackCoach");
	}

}
