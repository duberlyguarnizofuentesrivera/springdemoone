package com.duberlyguarnizo.springdemo;

public class BaseballCoach implements Coach {
	private FortuneService fortune;

	public BaseballCoach(FortuneService fortune) {
		super();
		this.fortune = fortune;
	}

	@Override
	public String getDailyWorkout() {
		return "Batea tu pelotita y luego corre alrededor de un cuadrado!";
	}

	@Override
	public String getDailyFortune() {
		return fortune.happyFortuneYo();
	}
}
