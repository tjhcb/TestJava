package com.test.pattern.factory;

public abstract class MenuFactory {

	public abstract Desert getDesert(String desertType);
	public abstract Snacks getSnacks(String snacksType);
}
