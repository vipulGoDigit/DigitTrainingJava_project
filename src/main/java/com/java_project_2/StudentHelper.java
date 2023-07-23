package com.java_project_2;



import java.util.ArrayList;
import java.util.Scanner;

public class StudentHelper {
	private static ArrayList<Student> studentList = new ArrayList<Student>();
	private static int studentID = 21;

	static int studentIDGenerator() {
		studentID++;
		return studentID;
	}

	public static void addStudent(Student curStudent) {
		studentList.add(curStudent);
	}

	public static Student getStudentFromID(int id) {
		for (Student curStudent : studentList) {
			if (curStudent.getStudentID() == id) {
				return curStudent;
			}
		}
		return null;
	}

	public static ArrayList<Student> getStudentList() {
		return studentList;
	}

	public static void printStudentMarks(Student curStudent) {
		if (curStudent.getMarksSecured() != -1) {
			System.out.println("You Got: " + curStudent.getMarksSecured() + " marks!");
		} else {
			System.out.println("It is yet to be graded");
		}
	}

	public static void printStudentDetails(Student curStudent, String msg) {
		System.out.println(msg);
		System.out.println("\tStudent ID: " + curStudent.getStudentID());
		System.out.println("\tStudent Name: " + curStudent.getName());
		System.out.println("\tCourse Enrolled: " + curStudent.getCourseEnrolled() + " - "
				+ CourseHelper.getCourseNameFromID(curStudent.getCourseEnrolled()));
		System.out.println("\tStudent Age: " + curStudent.getAge());
		System.out.println("\tStudent City: " + curStudent.getCity());
		System.out.println();
	}

	public static void printStudentMarksCard(Student curStudent) {
		if (curStudent.getMarksSecured() == -1) {
			System.out.println("It is yet to be graded");
			return;
		}
		System.out.println("\t --- Marks Card --- \n");
		System.out.println("Student ID       : " + curStudent.getStudentID());
		System.out.println("Student Name     : " + curStudent.getName());
		System.out.println("Student Age      : " + curStudent.getAge());
		System.out.println("Student City     : " + curStudent.getCity());
		System.out.println("Course Enrolled  : " + curStudent.getCourseEnrolled());
		System.out.println("Course Name      : " + CourseHelper.getCourseNameFromID(curStudent.getCourseEnrolled()));
		System.out.println("Score out of 100 : " + curStudent.getMarksSecured());
		System.out.println();
	}
}
