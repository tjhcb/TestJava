package com.test;

public class DoublyLL<E> {

class Node<T> {
		
		public Node(T data){
			this.next = null;
			this.previous = null;
			this.data = data;
			
		}
		
		protected Node<T> next;
		protected Node<T> previous;
		protected T data;
		
		/**
		 * @return the next
		 */
		public Node<T> getNext() {
			return next;
		}
		/**
		 * @param next the next to set
		 */
		public void setNext(Node <T>next) {
			this.next = next;
		}
		/**
		 * @return the previous
		 */
		public Node<T> getPrevious() {
			return previous;
		}
		/**
		 * @param previous the previous to set
		 */
		public void setPrevious(Node<T> previous) {
			this.previous = previous;
		}
		/**
		 * @return the data
		 */
		public T getData() {
			return data;
		}
		/**
		 * @param data the data to set
		 */
		public void setData(T data) {
			this.data = data;
		}
		
	}

	protected Node<E> start;
	protected Node<E> end;
	protected E data;
	
	public void addFirst(E data){
		Node<E> current = new Node<E>(data);
		
		if(null == start){
			start = current;
			end = start;
		}
		else{
			Node<E> temp = start;
			temp.setPrevious(current);
			current.setNext(temp);
			start = current;
		}
	}
	
	public void addLast(E data){
		Node<E> current = new Node<E>(data);
		if(null == end){
			start = current;
			end = start;
		}
		else{
			current.setPrevious(end);
			end.setNext(current);
			end = current;
		}
	}
	
	public void add(int index, E data){
		Node<E> temp = start;
		Node<E> current = new Node<E>(data);
		if(null != temp){
			if(index == 0){
				this.addFirst(data);
			}else{
				for(int i=0; i<index; i++){
					temp = temp.getNext();
				}
				current.setNext(temp.getNext());
				if(null != temp.getNext()){
					temp.getNext().setPrevious(current);
				}
				current.setPrevious(temp);
				temp.setNext(current);
			}
		}
	}
	
	public Object[] get(){
		E[] data = (E[])new Object[this.size()];
		Node<E> temp = start;
		int i = 0;
		if(null != temp){
			data[i] = temp.getData();
			while(null != temp.getNext()){
				temp = temp.getNext();
				data[++i] = temp.getData();
			}
		}
		return data;
	}
	
	public void removeLast(){
		Node<E> temp = end;
		System.out.println("Test: " + temp.getData());
		//temp.setPrevious(null);
		temp = temp.getPrevious();
		System.out.println("Test: " + temp.getData());
		if(null != temp){
			temp.setNext(null);
		}
		//temp.setNext(null);
		//end = temp;
		/*System.out.println("End: " + end.getData());
		while(null != end.getPrevious()){
			end = end.getPrevious();
			System.out.println("End: " + end.getData());
		}*/
	}
	
	public void remove(int index){
		Node<E> temp = start;
		//Node prev = null;
		Node<E> next = null;
		if(null != temp){
			for(int i=0; i<index; i++){
				temp = temp.getNext();
			}
			//prev = temp.getPrevious();
			next = temp.getNext();
			temp.getPrevious().setNext(next);
		}
	}
	
	public void removeFirst(){
		Node<E> temp = start;
		if(null != temp && null != temp.getNext()){
			temp = temp.getNext();
			temp.getPrevious().setNext(null);
			temp.setPrevious(null);
		}
	}
	
	public int size(){
		int count = 0;
		Node<E> temp = start;
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