package com.stpl.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PracticeHelloSpringApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach theCoach = context.getBean("myGolfCoach", Coach.class);
		
		System.out.println("DailyWorkout =======>>> " + theCoach.getDailyWorkout());
		System.out.println("DailyFortune =======>>> " + theCoach.getDailyFortune());
		System.out.println("DailyFortune =======>>> " + theCoach.getDailyFortune());
	}

}
