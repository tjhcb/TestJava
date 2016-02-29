package com.test;

public class SinglyLinkedList<E> {

	class Node<T> {
		public T data;
		public Node<T> link;
		
		public Node(T obj){
			this.data = obj;
			this.link = null;
		}
		
		public T getData() {
			return data;
		}
		public void setData(T data) {
			this.data = data;
		}
		public Node<T> getLink() {
			return link;
		}
		public void setLink(Node<T> link) {
			this.link = link;
		}
	}
	
	protected Node<E> head;
	
	public SinglyLinkedList(){
		this.head = null;
	}
	
	/**
	 * Inserts object at the end of Linked List
	 * 
	 * @param data
	 */
	public void add(E data){
		Node<E> tempO = new Node<E>(data);
		
		if(null == head){
			head = new Node<E>(data);
		}else{
			Node<E> current = head;
			while(null != current.getLink()){
				current = current.getLink();
			}
			current.setLink(tempO);
		}
	}
	
	/**
	 * Inserts data at particular index
	 * 
	 * @param index
	 * @param data
	 */
	public void add(int index, E data){
		Node<E> temp = head;
		Node<E> current = new Node<E>(data);
		if(null != temp){
			for(int i=0; i<index-1; i++){
				temp = temp.getLink();
			}
			current.setLink(temp.getLink());
			temp.setLink(current);
		}
	}
	
	/**
	 * Returns array of objects inserted
	 * 
	 * @return
	 */
	public E[] get(){
		E[] obj = (E[])new Object[this.size()];
		Node<E> temp = head;
		int i = 0;
		if(null != temp){
			obj[i] = temp.getData();
			while(null != temp.getLink()){
				temp = temp.getLink();
				obj[++i] = temp.getData();
			}
		}
		return obj;
	}
	
	/**
	 * Returns object at particular index
	 * 
	 * @param index
	 * @return
	 */
	public E get(int index){
		E obj = null;
		Node<E> temp = head;
		
		if(null != temp){
			if(null != temp.getLink()){
				for(int i=0; i<index; i++){
					temp = temp.getLink();
				}
			}
			obj = temp.getData();
		}
		return obj;
	}
	
	/**
	 * Removes last element
	 * 
	 */
	public void removeLast(){
		Node<E> temp = head;
		Node<E> end = null;
		if(null != temp){
			while(null != temp.getLink()){
				end = temp;
				temp = temp.getLink();
			}
			end.setLink(null);
		}
	}
	
	/**
	 * Remove first element
	 * 
	 */
	public void removeFirst(){
		Node<E> temp = head;
		if(null != temp){
			temp.setData(temp.getLink().getData());
			temp.setLink(temp.getLink().getLink());
		}
	}
	
	/**
	 * Remove element at particular index
	 * 
	 * @param index
	 * @return
	 */
	public boolean remove(int index){
		Node<E> temp = head;
		Node<E> hold = null;
		if(null != temp){
			if(index == 0)
				return false;
			for(int i=0; i<index; i++){
				hold = temp;
				temp = temp.getLink();
			}
			hold.setLink(temp.getLink());
		}
		return false;
	}
	
	/**
	 * Returns count of objects
	 * 
	 * @return
	 */
	public int size(){
		Node<E> temp;
		int count = 0;
		temp = head;
		if(null != temp){
			count++;
			while(null != temp.getLink()){
				temp = temp.getLink();
				count++;
			}
		}
		return count;
	}
}