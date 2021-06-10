package com.duberlyguarnizo.springdemo;

public class BaseballCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		final String result = "Do some 20 minutes in  batting practice";
		return result;
	}

	@Override
	public FortuneService getFortune() {
		// TODO Auto-generated method stub
		return null;
	}
}
