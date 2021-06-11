package com.duberlyguarnizo.springdemo;

public class SoccerCoach implements Coach {
	private FortuneService fortune;

	protected SoccerCoach(FortuneService fortune) {
		super();
		this.fortune = fortune;
	}

	@Override
	public String getDailyWorkout() {
		return "Juega fulbol y maneja ebrio!";
	}

	@Override
	public String getDailyFortune() {
		return fortune.happyFortuneYo();
	}

}
