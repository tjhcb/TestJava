package com.test;

import java.util.Arrays;


public class ArrayList<E> {

	Object[] array = new Object[10];
	int size = 0;
	
	public void add(Object o){
		ensureCapacity();
		array[size++] = o;
	}
	
	public void add(int index, Object o){
		Object[] temp = Arrays.copyOf(array, size+1);
		for(int i=0; i<size; i++){
			if(i == index){
				array[index] = o;
				size++;
				break;
			}
		}
		
		for(int j=index+1; j<size; j++){
			array[j] = temp[j-1];
		}
	}
	
	public void display(){
		for(int i=0; i<size; i++){
			System.out.println(array[i].toString());
		}
	}
	
	public Object get(int index){
		Object o = null;
		for(int i=0; i<index; i++){
			o = array[i+1];
		}
		return o;
	}
	
	public void remove(int index){
		Object[] temp = Arrays.copyOf(array, size+1);
		for(int i=index; i<size; i++){
			array[i] = temp[i+1];
			size--;
		}
	}
	
	public void ensureCapacity(){
		if(size > array.length*3/4){
			System.out.println("called");
			Object[] temp = Arrays.copyOf(array, array.length*3/2);
			array = new Object[array.length*3/2];
			array = temp;
		}
	}
}
