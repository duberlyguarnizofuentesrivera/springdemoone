package com.duberlyguarnizo.springdemo;

public class RandomFortune implements FortuneService {

	private final String f1 = "Today you shall find a penny!";
	private final String f2 = "Yesterday was bad, today will be equally bad..";
	private final String f3 = "Today you will match the lottery numbers...of last week";
	private final String f4 = "Your wife cheated on you. Tomorrow you'll get your revenge!";
	private String[] fortunes = new String[] {f1,f2,f3,f4} ;

	@Override
	public String happyFortuneYo() {
		java.util.Random rnd = new java.util.Random();
		return fortunes[rnd.nextInt(4)];
	}

}
