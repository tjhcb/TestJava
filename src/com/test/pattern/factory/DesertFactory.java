package com.test.pattern.factory;

public class DesertFactory extends MenuFactory {

	@Override
	public Desert getDesert(String desertType){
		if("Chocolates".equals(desertType)){
			return new Chocolates();
		}else if("IceCream".equals(desertType)){
			return new IceCream();
		}
		return null;
	}


	@Override
	public Snacks getSnacks(String snacksType) {
		return null;
	}
}
