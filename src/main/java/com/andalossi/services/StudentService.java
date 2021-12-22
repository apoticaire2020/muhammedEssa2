package com.andalossi.services;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;

import com.andalossi.models.Student;

@Service
public class StudentService {
	
	private static int studentNumber=3;
	private static List<Student> students = new ArrayList<Student>();
	
	static {
		students.add(new Student(0, "omar", false));
		students.add(new Student(1, "fatma", true));
		students.add(new Student(2, "leila", false));
		students.add(new Student(3, "ali", true));
		
	}
	public List<Student> readAllStudents(){
		List<Student> stus = new ArrayList<Student>();
		for (Student student : students) {
			
				stus.add(student);
			
		}
		return stus;
	}
	public void addStudent( String name, boolean isActive) {
		students.add(new Student(++studentNumber, name, isActive));
	}
	public void deleteStudent(int id) {
		Iterator<Student> it = students.iterator();
		while (it.hasNext()) {
			Student student = it.next();
			if (student.getId()==id) {
				it.remove();
			}
			
		}
	}
	public Student getStudent(int id) {
		for (Student student : students) {
			if (student.getId()==id) {
				return student;
			}
			
		}
		return null;
	}
	public void updateStudent( int id, String name , boolean isActive) {
		Iterator<Student> it = students.iterator();
		while (it.hasNext()) {
			Student student = it.next();
			if (student.getId()==id) {
				student.setName(name);
				student.setActive(isActive);
			}
	}

}
}
