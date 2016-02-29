package com.test.pattern.singleton;

import java.util.Map;

public class Principal {

	public int countStudents(){
		ClassTeacher ct = ClassTeacher.getInstance();
		Map<String, String> studentsList = ct.getStudents();
		
		int count = 0;
		for(String attendance: studentsList.values()){
			if("P".equals(attendance)){
				count++;
			}
		}
		return count;
	}
}
