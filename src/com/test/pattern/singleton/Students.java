package com.test.pattern.singleton;

public class Students {

	public void logAttendance(String name){
		ClassTeacher ct = ClassTeacher.getInstance();
		ct.addStudent(name, "P");
	}
}
