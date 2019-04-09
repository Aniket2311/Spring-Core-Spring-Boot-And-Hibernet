package com.stpl.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach theCoach = context.getBean("myTrackCoach", Coach.class);
		
		System.out.println(theCoach.getDailyFortune());
		
		context.close();
	}

}
