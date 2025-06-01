package StudentManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		StudentManager manager = new StudentManager();
		
		List<Course> courseList = new ArrayList<>();
	    courseList.add(new Course("Math", "kalp", 20, 10.0));
	    courseList.add(new Course("Science", "puppy", 30, 11.0));
		
		manager.addStudent(1, "Srikanth", "Srikanth@gamul.com", courseList);
        manager.addStudent(2, "Kalpana", "kalpana@gmail.com", courseList);
		
        manager.addCourse("CSE", "Computer Science", 3);
        manager.addCourse("ECE", "Electronics", 4);

        manager.enrollStudentInCourse(1, "Civil");
        manager.enrollStudentInCourse(2, "ECE");

        manager.assignGrade(1, "Civil", 90.5);
        manager.assignGrade(2, "ECE", 85.0);

        manager.displayStudentInfo(1);
        manager.displayStudentInfo(2);

	}

}
