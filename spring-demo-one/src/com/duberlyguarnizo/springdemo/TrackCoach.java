package com.duberlyguarnizo.springdemo;

public class TrackCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Run 5k and return untired!";
	}

	@Override
	public FortuneService getFortune() {
		// TODO Auto-generated method stub
		return null;
	}

}
