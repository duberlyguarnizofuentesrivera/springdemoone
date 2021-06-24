package com.duberlyguarnizo.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PracticeActivity3 {
public static void main(String[] args) {
	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("practiceActivity3-applicationContext.xml");
	Coach daCoach = context.getBean("cricketCoach", CricketCoach.class);
	System.out.println(daCoach.getDailyFortune());
	context.close();
}
}
