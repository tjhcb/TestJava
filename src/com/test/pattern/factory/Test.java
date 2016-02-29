package com.test.pattern.factory;

public class Test {

	public static void main(String[] args) {
		//Creational pattern === Factory example
		DesertFactory df = new DesertFactory();
		Desert choco = df.getDesert("Chocolates");
		Desert ice = df.getDesert("IceCream");
		System.out.println(choco.getDesert());
		System.out.println(ice.getDesert());
		
		//Creational pattern === Abstract Factory example
		MenuProducer mp = new MenuProducer();
		MenuFactory mfd = mp.getOrder("Desert");
		MenuFactory mfs = mp.getOrder("Snacks");
		
		Desert d = mfd.getDesert("IceCream");
		System.out.println(d.getDesert());
		
		Snacks s = mfs.getSnacks("Burger");
		System.out.println(s.getSnacks());
	}
}
