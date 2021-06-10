package com.duberlyguarnizo.springdemo;

public class HappyFortune implements FortuneService {

	@Override
	public String happyFortuneYo() {
		return "Yo man, you're so lucky, your girlfriend wants to watch!";
	}

}
