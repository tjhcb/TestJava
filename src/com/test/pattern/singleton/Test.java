package com.test.pattern.singleton;

public class Test {

	public static void main(String[] args) {
		
		//Creational pattern === Singleton pattern
		Students st = new Students();
		st.logAttendance("Shivani");
		st.logAttendance("Neha");
		st.logAttendance("Rahul");
		st.logAttendance("Pankaj");
		st.logAttendance("Pritam");
		st.logAttendance("Tejaswini");
		
		Principal pc = new Principal();
		st.logAttendance("Poonam");
		st.logAttendance("Ritika");
		//Principal pc = new Principal();
		int count = pc.countStudents();
		System.out.println(count);
		
		ClassTeacher ct = ClassTeacher.getInstance();
		ct.markAbsent("Tejaswini");
		
		int count2 = pc.countStudents();
		System.out.println(count2);
		
	}
}
