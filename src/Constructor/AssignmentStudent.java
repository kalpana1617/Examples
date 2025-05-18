package Constructor;

import java.util.Scanner;

public class AssignmentStudent {

	int sid;
	String sname;
	int maths, science, english;

	AssignmentStudent(int sid, String sname, int maths, int science, int english) {
		this.sid = sid;
		this.sname = sname;
		this.maths = maths;
		this.science = science;
		this.english = english;
	}

	public void status() {
		int totalMarks = maths + science + english;
		int percentage = (totalMarks / 3);

		char grade;
		if (percentage >= 80) {
			grade = 'A';
		} else if (percentage >= 60) {
			grade = 'B';
		} else if (percentage >= 40) {
			grade = 'C';
		} else {
			grade = 'D';
		}
		display(totalMarks, percentage, grade);
	}

	private void display(int totalMarks, int percentage, char grade) {
		System.out.println("Student ID: " + sid);
		System.out.println("Student Name: " + sname);
		System.out.println("Hi " + sname + ", your total marks are " + totalMarks + " and your percentage is "
				+ percentage + "%.");
		System.out.println("Your grade is: " + grade);

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the student id:");
		int sid = sc.nextInt();
		sc.nextLine();
		System.out.print("enter the student name:");
		String sname = sc.nextLine();
		System.out.print("Enter marks for Maths: ");
		int maths = sc.nextInt();
		System.out.print("Enter science for Maths: ");
		int science = sc.nextInt();
		System.out.print("Enter marks for Maths: ");
		int english = sc.nextInt();

		AssignmentStudent student = new AssignmentStudent(sid, sname, maths, science, english);
		student.status();

	}
}
