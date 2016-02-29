package com.test.pattern;

public class Test {

	public static void main(String[] args) {
		SocketSender ss = new SocketSender();
		ss.sendMessage();
		System.out.println("Socket opened");
		SocketReceiver sr = new SocketReceiver();
		sr.receiveMsg();
	}
}
