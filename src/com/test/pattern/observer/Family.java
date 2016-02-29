package com.test.pattern.observer;

public class Family implements Observer {

	@Override
	public void update(int heartRate) {
		System.out.println("Current heart rate: " + heartRate);
	}
	
}
