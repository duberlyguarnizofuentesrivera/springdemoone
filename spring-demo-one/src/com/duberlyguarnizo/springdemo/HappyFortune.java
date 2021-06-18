package com.duberlyguarnizo.springdemo;

public class HappyFortune implements FortuneService {
	

	@Override
	public String happyFortuneYo() {
		return "This is a happy day for everyone...but you! Smile! :-) ";
	}

}
