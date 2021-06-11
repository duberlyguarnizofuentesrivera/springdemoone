package com.duberlyguarnizo.springdemo;

public class CricketCoach implements Coach {
	private FortuneService fortune;

	@Override
	public String getDailyWorkout() {
		return "Some cricket for ya!";
	}
//using this for setter method injection
	public void setFortune(FortuneService fortune) {
		this.fortune = fortune;
	}

	@Override
	public String getDailyFortune() {
		return fortune.happyFortuneYo();
	}

}
