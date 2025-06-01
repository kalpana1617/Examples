package StudentManagementSystem;

public class Grade {

	private Course course;
	private double grade;

	public Grade(Course course, double grade) {
		this.course = course;
		this.grade = grade;
	}

	public void displayGradeInfo() {
		System.out.println("Course:" + course.getName() + " " + course.getGrade());
		System.out.println("Grade:" + grade);
	}

}
