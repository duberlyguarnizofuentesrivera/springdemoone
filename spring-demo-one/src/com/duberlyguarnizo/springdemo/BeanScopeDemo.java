package com.duberlyguarnizo.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemo {
	public static void main(String[] args) {
		// load spring config
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

		// retrieve bean...
		Coach daCoach = context.getBean("trackCoach", Coach.class);
		//Coach daOtherCoach = context.getBean("trackCoach", Coach.class);
		//apply methods, just for fun...
		System.out.println(daCoach.getDailyFortune());
		//System.out.println(daOtherCoach.getDailyFortune());
		//verify that these are different instances of Coach (scope=prototype)
		//System.out.println(daCoach==daOtherCoach);
		context.close();
	}
}
