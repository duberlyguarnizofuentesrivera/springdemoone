package com.duberlyguarnizo.springdemo;

public class CricketCoach implements Coach {
	private FortuneService fortune;
	private String emailAddress;
	private String team;
	private int yearsOld;

//	public CricketCoach(String emailAddress, String team, int years) {
//		this.emailAddress = emailAddress;
//		this.team = team;
//		this.yearsOld = years;
//	}

	public String getEmailAdress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
		System.out.println("---> Setting email address...");
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
		System.out.println("---> Setting team...");
	}

	public int getYearsOld() {
		return yearsOld;
	}

	public void setYearsOld(int yearsOld) {
		this.yearsOld = yearsOld;
		System.out.println("---> Setting years old...");
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
		System.out.println("---> Setting your fortune!...");
	}

	@Override
	public String getDailyFortune() {
		return fortune.happyFortuneYo();
	}

	// --------- Init and destroy methods--------
	public void startUpCoach() {

		if (getYearsOld() < 10) {
			System.out.println("INIT-METHOD: Tu equipo joven es, pequeño saltamontes!");
		}
		else {
			System.out.println("INIT-METHOD: Tas viejo tío! Y tu equipo tambien!");
		}
	}

	public void cleanUpCoach() {
		System.out.println("DESTROY-METHOD: Just cleaning the Coach leftovers... don't mind me!");
	}

}
