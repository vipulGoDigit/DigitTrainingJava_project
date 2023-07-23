package com.java_project_2;


import java.util.ArrayList;
import java.util.Scanner;

public class ProfessorHelper {
	private static ArrayList<Professor> professorList = new ArrayList<Professor>();
	private static int professorID = 11;

	static int professorIDGenerator() {
		professorID++;
		return professorID;
	}

	public static void addProfessor(Professor curProfessor) {
		professorList.add(curProfessor);
	}

	public static Professor getProfessorFromID(int id) {
		for (Professor curProf : professorList) {
			if (curProf.getProfessorID() == id) {
				return curProf;
			}
		}
		return null;
	}

	public static void printProfessorDetails(Professor curProf) {
		System.out.println("Registered Professor Details:");
		System.out.println("\tProfessor ID: " + curProf.getCourseID());
		System.out.println("\tProfessor Name: " + curProf.getName());
		System.out.println("\tProfessor Teach: " + curProf.getCourseID() + " - "
				+ CourseHelper.getCourseNameFromID(curProf.getCourseID()));
		System.out.println("\tProfessor Age: " + curProf.getAge());
		System.out.println("\tProfessor City: " + curProf.getCity());
		System.out.println("\tProfessor's Year's of Experience: " + curProf.getYearsOfExpreience());
		System.out.println();
	}

	public static void gradeStudentOfProfessor(Professor curProfessor) {
		Scanner sc = new Scanner(System.in);
		for (Student curStudent : StudentHelper.getStudentList()) {
			if (curStudent.getCourseEnrolled() == curProfessor.getCourseID() && curStudent.getMarksSecured() == -1) {

				StudentHelper.printStudentDetails(curStudent, "Student Details: ");

				System.out.println(
						"Enter marks for Student " + curStudent.getName() + " (Enter \"S\" to skip): ");
				while (true) {
					String inp = sc.nextLine();
					try {
						if (inp.equalsIgnoreCase("S")) {
							System.out.println("Student Grading Skipped\n");
							break;
						} else {
							int curStudMarks = Integer.parseInt(inp);
							curStudent.setMarksSecured(curStudMarks);
							System.out.println("Student " + curStudent.getName() + " scored " + curStudMarks + ".\n");
							break;
						}
					} catch (Exception e) {
						System.out.println("Invalid Input");
					}
				}
			}
		}
		System.out.println("Grading Done!");
	}
}
