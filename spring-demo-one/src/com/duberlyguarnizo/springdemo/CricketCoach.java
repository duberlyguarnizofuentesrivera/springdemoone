package com.duberlyguarnizo.springdemo;

public class CricketCoach implements Coach {
	private FortuneService fortune;
	private String emailAddress;
	private String team;
	private int yearsOld;

	public String getEmailAdress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
		System.out.println("Setting email address...");
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
		System.out.println("setting team...");
	}
	public int getYearsOld() {
		return yearsOld;
	}
	public void setYearsOld(int yearsOld) {
		this.yearsOld = yearsOld;
		System.out.println("Setting years old...");
	}
	public FortuneService getFortune() {
		return fortune;
	}
	@Override
	public String getDailyWorkout() {
		return "Some cricket for ya!";
	}
//using this for setter method injection
	public void setFortune(FortuneService fortune) {
		this.fortune = fortune;
		System.out.println("Setting your fortune!...");
	}

	@Override
	public String getDailyFortune() {
		return fortune.happyFortuneYo();
	}

}
