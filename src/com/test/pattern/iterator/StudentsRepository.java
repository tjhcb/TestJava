package com.test.pattern.iterator;

import java.util.ArrayList;
import java.util.List;

public class StudentsRepository {

	List<Student> students = new ArrayList<Student>();
	
	public void addStudents(){
		Student st = new Student();
		st.setName("Shree");
		st.setRollNo(01);
		st.setStandard("Nursery");
		students.add(st);
		st = new Student();
		st.setName("Ratna");
		st.setRollNo(02);
		st.setStandard("1st");
		students.add(st);
		st = new Student();
		st.setName("Pranav");
		st.setRollNo(03);
		st.setStandard("2nd");
		students.add(st);
		st = new Student();
		st.setName("Shiva");
		st.setRollNo(04);
		st.setStandard("1st");
		students.add(st);
	}
	
	public Iterator getIterator(){
		return new StudentsIterator();
	}
	
	class StudentsIterator implements Iterator {

		int index=0;
		
		@Override
		public boolean hasNext() {
			if(index < (students.size()-1)){
				return true;
			}
			return false;
		}

		@Override
		public Object next() {
			Student student = null;
			if(hasNext()){
				return students.get(++index);
			}
			return student;
		}
		
	}
}
