package com.test.pattern.factory;

public class SnacksFactory extends MenuFactory {

	@Override
	public Snacks getSnacks(String snacksType){
		if("Burger".equals(snacksType)){
			return new Burger();
		}else if("Sandwich".equals(snacksType)){
			return new Sandwich();
		}
		return null;
	}

	@Override
	public Desert getDesert(String desertType) {
		return null;
	}
}
