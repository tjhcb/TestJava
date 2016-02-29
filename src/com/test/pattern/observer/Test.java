package com.test.pattern.observer;

public class Test {

	public static void main(String[] args) {
		//Behavioral pattern === Observer pattern
		
		Nurse nurse = new Nurse();
		Family fam = new Family();
		
		Patient pt = new Patient();
		pt.registerObserver(nurse);
		pt.registerObserver(fam);
		
		pt.setHeartRate(100);
	}

}
