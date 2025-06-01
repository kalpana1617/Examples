package StudentManagementSystem;

import java.util.List;

public class Student {

	private int id;
	private String name;
	private String email;
	private List<Course> courses;

	public Student(int id, String name, String email, List<Course> courses) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.courses = courses;
	}

	public void assignCourse(Course course) {
		courses.add(course);
	}

	public void assignGrade(Course course, double grade) {
		for (Course c : courses) {
			if (c.equals(course)) {
				c.setGrade(grade);
				break;
			}
		}
	}

	public void displayStudentInfo() {
		System.out.println("Student ID:" + id);
		System.out.println("Name:" + name);
		System.out.println("email:" + email);
		for (Course course : courses) {
			System.out.println(course.getName() + "- Grade" + course.getGrade());

		}
	}

	void enrollCourse(Course course) {
		if (!courses.contains(course)) {
			courses.add(course);
		}

	}

}
