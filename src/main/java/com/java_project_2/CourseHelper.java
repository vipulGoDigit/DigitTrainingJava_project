package com.java_project_2;



import java.util.ArrayList;

public class CourseHelper {

	private static ArrayList<Course> courseList = new ArrayList<Course>();
	private static int courseID = 1;

	static int courseIDGenerator() {
		courseID++;
		return courseID;
	}

	public static void addCourse(Course curCourse) {
		courseList.add(curCourse);
	}
	
	public static String getCourseNameFromID(int curID) {
		for (Course curCourse: courseList) {
			if (curCourse.getCourseID() == curID) {
				return curCourse.getName();
			}
		}
		return "";
	}
	
	public static void printCourseNames() {
		System.out.println("Choose from Courses: ");
		for (Course curCourse: courseList) {
			System.out.println("\t" + curCourse.getCourseID() + " : " + curCourse.getName());
		}
		System.out.println();
	}
	
	public static void printCourseDetails(Course curCourse) {
		System.out.println("Registered Course Details:");
		System.out.println("\tCourse ID: " + curCourse.getCourseID());
		System.out.println("\tCourse Name: " + curCourse.getName());
		System.out.println("\tCourse Fee: " + curCourse.getFee());
		System.out.println("\tCourse Duration: " + curCourse.getDurationInHrs());
		System.out.println("\tCourse Description: " + curCourse.getCourseDescription());
		System.out.println();
	}
	
	public static boolean isValidCourseID(int curID) {
		for (Course curCourse: courseList) {
			if (curCourse.getCourseID() == curID) {
				return true;
			}
		}
		return false;
	}
}
