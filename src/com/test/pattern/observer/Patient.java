package com.test.pattern.observer;

import java.util.ArrayList;
import java.util.List;

public class Patient implements Observable {

	public List<Observer> observers = new ArrayList<Observer>();
	public int heartRate;
	
	/**
	 * @return the heartRate
	 */
	public int getHeartRate() {
		return heartRate;
	}

	/**
	 * @param heartRate the heartRate to set
	 */
	public void setHeartRate(int heartRate) {
		this.heartRate = heartRate;
		notifyAllObservers();
	}
	

	@Override
	public void registerObserver(Observer obs) {
		observers.add(obs);
	}

	@Override
	public void removeObserver(Observer obs) {
		observers.remove(obs);
	}

	@Override
	public void notifyAllObservers() {
		for(Observer ob: observers){
			ob.update(this.heartRate);
		}
	}

}
