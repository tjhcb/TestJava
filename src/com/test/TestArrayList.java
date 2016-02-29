package com.test;


public class TestArrayList {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("Monday");
		list.add("Tuesday");
		list.add("Wednesday");
		list.add(1, "Thursday");
		list.add("Friday");
		list.add(0, "Sunday");
		System.out.println("size"+list.size);
		list.display();
		list.remove(2);
		list.remove(4);
		list.add(1, "Saturday");
		list.add("Monday");
		list.add("Tuesday");
		list.add("Wednesday");
		list.add(1, "Thursday");
		list.add("Tuesday");
		list.add("Wednesday");
		list.display();
		list.add("Monday");
		list.add("Tuesday");
		list.add("Wednesday");
		list.add(1, "Thursday");
		list.add("Friday");
		list.add(0, "Sunday");
		System.out.println("size"+list.size);
		list.display();
		list.remove(2);
		list.remove(4);
		list.add(1, "Saturday");
		list.add("Monday");
		list.add("Tuesday");
		list.add("Wednesday");
		list.add(1, "Thursday");
		list.add("Tuesday");
		list.add("Wednesday");
		list.display();
		System.out.println(list.size);
		System.out.println("Data: " + list.get(4));
		System.err.println("array length: " + list.array.length);
	}
}
