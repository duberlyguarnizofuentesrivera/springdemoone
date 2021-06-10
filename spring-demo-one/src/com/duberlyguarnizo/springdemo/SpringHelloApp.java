package com.duberlyguarnizo.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringHelloApp {
	public static void main(String[] args) {
		// load config from xml
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		// retrieve the bean
		Coach daCoach = context.getBean("soccerCoach", Coach.class);
		// call methos on the bean
		String result = daCoach.getDailyWorkout();
		System.out.println("From object loaded from xml file");
		System.out.println(result);
		System.out.println(daCoach.getFortune().happyFortuneYo());
		// close the context
		context.close();

	}

}
