package com.duberlyguarnizo.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringHelloApp {
	public static void main(String[] args) {
		// load config. from xml
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		// retrieve the bean
		Coach daCoach = context.getBean("cricketCoach", Coach.class);
		// call methods on the bean
		String result = daCoach.getDailyWorkout();
		System.out.println(result);
		System.out.println(daCoach.getDailyFortune());
		System.out.println( ((CricketCoach) daCoach).getEmailAdress());
		System.out.println( ((CricketCoach) daCoach).getTeam());
		System.out.println( ((CricketCoach) daCoach).getYearsOld());
		// close the context
		context.close();

	}

}
