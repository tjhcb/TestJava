package com.test;

public abstract interface AbstractInterface {

	public void test();
	
	interface NestedInterface{
		public void testing();
		public void test();
	}
	
	public static class A{
		public static Object a(){
			return null;
		}
	}
}
