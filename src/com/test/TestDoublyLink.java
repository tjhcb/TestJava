package com.test;

public class TestDoublyLink {

	public static void main(String[] args) {
		/*DoublyLinkedList dll = new DoublyLinkedList();
		dll.add("1");
		dll.add("2");
		dll.add("3");
		dll.add(1, "4");
		dll.add("5");
		dll.add(4, "11");
		dll.add(6, "9");
		dll.addFirst("No 1");
		Object[] dataList = dll.get();
		for(Object data: dataList){
			System.out.println(data.toString());
		}
		System.out.println("size: " + dll.size());
		Object da = dll.getLast();
		System.out.println("Last: " + da);
		System.out.println("Index: " + dll.get(3));*/
		
		DoublyLL ll = new DoublyLL();
		ll.addLast(99);
		ll.addFirst(101);
		ll.add(0, 100);
		ll.addFirst(44);
		ll.add(2, 100);
		ll.addFirst(125);
		ll.addLast(55);
		
		Object[] data = ll.get();
		for(Object da: data){
			System.out.println("Data: " + da.toString());
		}
		System.out.println("Size: " + ll.size());
	}

}
