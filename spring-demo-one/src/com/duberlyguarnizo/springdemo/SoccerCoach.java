package com.duberlyguarnizo.springdemo;

public class SoccerCoach implements Coach {
	private FortuneService fortune;

	protected SoccerCoach(FortuneService fortune) {
		super();
		this.fortune = fortune;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Go get drunk and date models!";
	}

	@Override
	public FortuneService getFortune() {
		// TODO Auto-generated method stub
		return fortune;
	}

}
