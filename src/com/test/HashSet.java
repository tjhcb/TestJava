package com.test;

public class HashSet<E> {

	private Object obj = new Object();
	private final CustomHashMap<E, Object> hash = new CustomHashMap<E, Object>();
	
	public boolean add(E data){
		return hash.put(data, obj) == null;
	}
	
	public void remove(E data){
		hash.remove(data);
	}
}
