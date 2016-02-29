package com.test.pattern.iterator;

public class Test {

	public static void main(String[] args) {
		StudentsRepository sr = new StudentsRepository();
		sr.addStudents();
		
		Iterator it = sr.getIterator();
		
		while(it.hasNext()){
			//System.out.println(sr.students.get(0).getName()+" "+sr.students.get(0).getRollNo()+" "+sr.students.get(0).getStandard());
			Student stu = (Student)it.next();
			System.out.println(stu.getName()+" "+stu.getRollNo()+" "+stu.getStandard());
		}
	}
}
