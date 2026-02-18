package com.codsoft;
import java.util.ArrayList;

public class StudentManagementSystem {

	private ArrayList<Student> students;

	public StudentManagementSystem() {
		students = new ArrayList<>();
	}

	public void addStudent(Student student) {
		students.add(student);
		System.out.println("Student added successfully.");
	}

	public void removeStudent(int rollNumber) {
		boolean found = false;

		for (Student s : students) {
			if (s.getRollNumber() == rollNumber) {
				students.remove(s);
				System.out.println("Student removed successfully.");
				found = true;
				break;
			}
		}

		if (!found) {
			System.out.println("Student not found.");
		}
	}

	public void searchStudent(int rollNumber) {
		for (Student s : students) {
			if (s.getRollNumber() == rollNumber) {
				System.out.println(s);
				return;
			}
		}
		System.out.println("Student not found.");
	}

	public void displayAllStudents() {
		if (students.isEmpty()) {
			System.out.println("No students available.");
		} else {
			for (Student s : students) {
				System.out.println(s);
			}
		}
	}
}
