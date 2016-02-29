package com.test;


public class DoublyLinkedList {

	class Node {
		
		public Node(Object data){
			this.next = null;
			this.previous = null;
			this.data = data;
			
		}
		
		protected Node next;
		protected Node previous;
		protected Object data;
		
		/**
		 * @return the next
		 */
		public Node getNext() {
			return next;
		}
		/**
		 * @param next the next to set
		 */
		public void setNext(Node next) {
			this.next = next;
		}
		/**
		 * @return the previous
		 */
		public Node getPrevious() {
			return previous;
		}
		/**
		 * @param previous the previous to set
		 */
		public void setPrevious(Node previous) {
			this.previous = previous;
		}
		/**
		 * @return the data
		 */
		public Object getData() {
			return data;
		}
		/**
		 * @param data the data to set
		 */
		public void setData(Object data) {
			this.data = data;
		}
		
	}
	
	protected Object data;
	protected Node head;
	protected Node tail;
	
	public void add(Object data){
		if(null == head){
			head = new Node(data);
		}
		else{
			Node temp = head;
			Node current = new Node(data);
			while(null != temp.getNext()){
				temp = temp.getNext();
			}
			current.setPrevious(temp);
			temp.setNext(current);
		}
	}
	
	public void addFirst(Object data){
		Node temp = head;
		Node current = new Node(data);
		if(null != temp){
			current.setNext(temp);
			temp.setPrevious(current);
		}
	}
	
	public void add(int index, Object data){
		Node temp = head;
		Node current = new Node(data);
		if(null != temp){
			for(int i=0; i<index-1; i++){
				System.out.println("loop" + i);
				temp = temp.getNext();
			}
			current.setPrevious(temp);
			current.setNext(temp.getNext());
			temp.setNext(current);
		}
	}
	
	public Object[] get(){
		Object[] obj = new Object[this.size()];
		Node temp = head;
		int i = 0;
		if(null != temp){
			//obj[i] = temp.getPrevious().getData();
			obj[i] = temp.getData();
			while(null != temp.getNext()){
				temp = temp.getNext();
				obj[++i] = temp.getData();
			}
		}
		return obj;
	}
	
	public Object getLast(){
		Node temp = head;
		Object data = null;
		if(null != temp){
			while(null != temp.getNext()){
				temp = temp.getNext();
			}
			data = temp.getData();
		}
		return data;
	}
	
	public Object get(int index){
		Node temp = head;
		Object data = null;
		if(null != temp){
			for(int i=0; i<index; i++){
				temp = temp.getNext();
			}
			data = temp.getData();
		}
		return data;
	}
	
	public int size(){
		Node temp = head;
		int count = 0;
		if(null != temp){
			count++;
			while(null != temp.getNext()){
				temp = temp.getNext();
				count++;
			}
		}
		return count;
	}
}
