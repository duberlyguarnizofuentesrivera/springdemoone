package com.duberlyguarnizo.springdemo;

public class TrackCoach implements Coach {
	private FortuneService fortune;

	public TrackCoach(FortuneService fortune) {
		super();
		this.fortune = fortune;
	}

	@Override
	public String getDailyWorkout() {
		return "Run 5k around the track and return untired!";
	}

	@Override
	public String getDailyFortune() {
		return fortune.happyFortuneYo();
	}

}
