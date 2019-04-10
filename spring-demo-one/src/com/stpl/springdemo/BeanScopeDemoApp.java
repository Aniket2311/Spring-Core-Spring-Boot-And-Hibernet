package com.stpl.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		Coach theCoach = context.getBean("myTrackCoach", Coach.class);

		Coach theAlphaCoach = context.getBean("myTrackCoach", Coach.class);
		
		System.out.println(theCoach == theAlphaCoach);
		System.out.println(theCoach);
		System.out.println(theAlphaCoach);
		
		context.close();
	}

}
