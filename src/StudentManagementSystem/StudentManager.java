package StudentManagementSystem;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentManager {

	private Map<Integer, Student> students;
	private Map<String, Course> courses;

	public StudentManager() {
		students = new HashMap<>();
		courses = new HashMap<>();
	}

	public void addStudent(int id, String name, String email, List<Course> courses) {
		students.put(id, new Student(id, name, email, courses));
	}

	public void addCourse(String code, String name, int creadits) {
		courses.put(name, new Course(code, name, creadits, creadits));
	}

	public void enrollStudentInCourse(int studentID, String courseCode) {
		Student student = students.get(studentID);
		Course course = courses.get(courseCode);
		if (student != null && course != null) {
			student.enrollCourse(course);
		}
	}

	public void assignGrade(int studentId, String courseCode, double grade) {
		Student student = students.get(studentId);
		Course course = courses.get(courseCode);
		if (student != null && course != null) {
			student.assignGrade(course, grade);
		}

	}

	public void displayStudentInfo(int studentId) {
		Student student = students.get(studentId);
		if (student != null) {
			student.displayStudentInfo();
		}
	}

	public void displayCourseInfo(String courseCode) {
		Course course = courses.get(courseCode);
		if (course != null) {
			course.displayCourseInfo();
		}
	}
}
