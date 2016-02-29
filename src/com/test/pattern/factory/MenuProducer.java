package com.test.pattern.factory;

public class MenuProducer {

	public MenuFactory getOrder(String orderType){
		if("Desert".equals(orderType)){
			return new DesertFactory();
		}
		else if("Snacks".equals(orderType)){
			return new SnacksFactory();
		}
		return null;
	}
}
