package com.test;

public class CustomHashMap<K, V> {

	static class Entry<K, V> {
		
		K key;
		V value;
		Entry<K, V> next;
		
		/**
		 * @return the key
		 */
		public K getKey() {
			return key;
		}
		/**
		 * @param key the key to set
		 */
		public void setKey(K key) {
			this.key = key;
		}
		/**
		 * @return the value
		 */
		public V getValue() {
			return value;
		}
		/**
		 * @param value the value to set
		 */
		public void setValue(V value) {
			this.value = value;
		}
		/**
		 * @return the next
		 */
		public Entry<K, V> getNext() {
			return next;
		}
		/**
		 * @param next the next to set
		 */
		public void setNext(Entry<K, V> next) {
			this.next = next;
		}
	}
	
	static final int INITIAL_CAPACITY = 16;
	static int capacity = INITIAL_CAPACITY;
	static final float LOAD_FACTOR = 0.75F;
	static float threshold;
	static int count = 0;
	static final Entry<?, ?>[] EMPTY_TABLE = new Entry[0];
	Entry<K, V>[] entries = (Entry[])EMPTY_TABLE;
	
	/*public void put(K key, V value){
		Entry temp = null;
		Entry entry = new Entry();
		entry.setKey(key);
		entry.setValue(value);
		int hash = hash(key);
		
		if(this.entries == EMPTY_TABLE){
			entries = new Entry[INITIAL_CAPACITY];
		}
		
		temp = entries[hash];
		
		if(count >= getThreshold()){
			this.resize();
		}
			if(null == temp) {
				entries[hash] = entry;
				count++;
			}else {
				if(key.equals(temp.getKey())){
					entries[hash].setValue(value);
					count++;
				}else{
					while(null != temp.getNext()){
						temp = temp.getNext();
						if(key.equals(temp.getKey())){
							System.out.println("same key");
							entries[hash].setValue(value);
							count++;
							return;
						}
					}
					//TODO: Check for key not matched case
					entries[hash].setNext(entry);
					count++;
				}
			}
	}*/
	
	public V put(K key, V value){
		Entry<K, V> temp = null;
		Entry<K, V> prev = null;
		Entry<K, V> entry = new Entry<K, V>();
		entry.setKey(key);
		entry.setValue(value);
		int hash = hash(key);
		
		if(this.entries == EMPTY_TABLE){
			entries = new Entry[INITIAL_CAPACITY];
		}
		temp = entries[hash];
		if(count >= getThreshold()){
			this.resize();
		}
		if(null == temp) {
			//System.out.println(value);
			entries[hash] = entry;
			count++;
			return null;
		} else {
			//System.out.println(value);
			while(null != temp){
				if(key.equals(temp.getKey())){
					entries[hash].setValue(value);
					count++;
					return value;
				}
				prev = temp;
				temp = temp.getNext();
			}
			temp = entry;
			prev.setNext(entry);
			entries[hash] = prev;
			count++;
			return null;
		}
	}
	
	public int hash(K key){
		return Math.abs(key.hashCode()) % capacity;
	}
	
	public V get(K key){
		V value = null;
		Entry<K, V> temp = entries[hash(key)];
		while(null != temp){
			if(key.equals(temp.getKey())){
				value = temp.getValue();
				return value;
			}
			temp = temp.getNext();
		}
		/*for(Entry<K, V> en: entries){
			if(null != en && key.equals(en.getKey())){
				value = en.getValue();
			}
		}*/
		return value;
	}
	
	public void remove(K key){
		Entry<K, V> prev = null;
		Entry<K, V> temp = entries[hash(key)];
		while(null != temp){
			if(key.equals(temp.getKey())){
				if(null != prev){
					prev.setNext(temp.getNext());
					count--;
					return;
				}else{
					entries[hash(key)] = entries[hash(key)].getNext();
					count--;
					return;
				}
			}
			prev = temp;
			temp = temp.getNext();
		}
	}
	
	private void resize(){
		int size = capacity << 1;
		Entry<K, V>[] newEntry = new Entry[size];
		for(int i=0; i<entries.length; i++){
			if(null != entries[i]){
				int j = hash(entries[i].getKey());
				newEntry[j] = entries[i];
			}
		}
		this.entries = newEntry;
	}
	
	private float getThreshold(){
		capacity = entries.length;
		threshold = capacity * LOAD_FACTOR;
		return threshold;
	}
}
