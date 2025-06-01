package StudentManagementSystem;

public class Course {

	private String code;
	private String name;
	private int credits;
	private double grade;

	public Course(String code, String name, int credits, double grade) {
		super();
		this.code = code;
		this.name = name;
		this.credits = credits;
		this.grade = grade;
	}

	public String getName() {
		return name;

	}

	public double getGrade() {
		return grade;

	}

	public void setGrade(double grade) {
		this.grade = grade;
	}

	public void displayCourseInfo() {
		System.out.println("course code:" + code);
		System.out.println("name:" + name);
		System.out.println("credits:" + credits);
		System.out.println("grade:" + grade);
	}

}
