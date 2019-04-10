package com.stpl.springdemo;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;
	
	public TrackCoach() {
		System.out.println("TrackCoach: Inside Constructor----");
	}

	public TrackCoach(FortuneService fortuneService) {
		System.out.println("TrackCoach: Inside Constructor with parameter FortuneService----");
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
	
	public void doMyStartupStuff() {
		System.out.println("TrackCoach: Inside method doMyStartupStuff---------");
	}
	
	public void doMyCleanupStuff() {
		System.out.println("TrackCoach: Inside method doMyCleanupStuff---------");
	}
}
