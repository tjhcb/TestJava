package com.test;

public class NestedInterfaceImpl implements AbstractInterface, AbstractInterface.NestedInterface {

	@Override
	public void test() {
		
	}

	@Override
	public void testing() {
		AbstractInterface.A.a(); 
	}
	
}
