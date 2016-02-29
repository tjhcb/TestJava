package com.test;

public class TestSinglyLink {

	public static void main(String[] args) {
		SinglyLinkedList linkList = new SinglyLinkedList();
		linkList.add("Hello");
		linkList.add("Welcome");
		linkList.add("Mr");
		linkList.add("Ram");
		linkList.add("to");
		linkList.add("India");
		
		Object[] dataList1 = linkList.get();
		for(Object dataL : dataList1){
			System.out.println(dataL.toString());
		}
		
		linkList.add(4, "First Element");
		//linkList.removeLast();
		//linkList.remove(5);
		linkList.removeFirst();
		Object data = linkList.get(0);
		Object[] dataList = linkList.get();
		for(Object dataL : dataList){
			System.out.println(dataL.toString());
		}
		System.out.println("Data: " + data +  " " + linkList.size());
	}
	
}