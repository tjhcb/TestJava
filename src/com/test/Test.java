package com.test;

public class Test {

	public static void main(String[] args) {
		DoublyLL ll = new DoublyLL();
		ll.addLast(99);
		//ll.add(1, 100);
		ll.addFirst(44);
		ll.add(1, 102);
		//ll.add(2, 100);
		ll.addFirst(125);
		ll.addLast(55);
		ll.addLast(505);
		ll.add(2, 101);
		ll.addFirst(195);
		ll.add(0, 111);
		Object[] data = ll.get();
		for(Object da: data){
			System.out.println("Data: " + da.toString());
		}
		System.out.println("Size: " + ll.size());

		ll.removeLast();
		ll.remove(1);
		ll.remove(3);
		ll.removeFirst();
		Object[] data1 = ll.get();
		for(Object da: data1){
			System.out.println("Data: " + da.toString());
		}
		System.out.println("Size: " + ll.size());
	}
}
