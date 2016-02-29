package com.test.pattern.singleton;

import java.util.HashMap;
import java.util.Map;

public class ClassTeacher {

	private ClassTeacher(){
		
	}
	
	public static ClassTeacher ct = new ClassTeacher();
	
	public static ClassTeacher getInstance(){
		return ct;
	}
	
	public Map<String, String> students = new HashMap<String, String>();
	
	public void addStudent(String name, String attendance){
		students.put(name, attendance);
	}
	
	public Map<String, String> getStudents(){
		return students;
	}
	
	public void markAbsent(String name){
		for(String student: students.keySet()){
			if(name.equals(student)){
				students.put(name, "A");
			}
		}
	}
}
