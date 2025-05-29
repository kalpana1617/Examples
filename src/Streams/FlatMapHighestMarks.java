package Streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

class Subject {
	String name;
	int marks;

	Subject(String name, int marks) {
		this.name = name;
		this.marks = marks;
	}
}

class Student {
	String name;
	List<Subject> subjects;

	Student(String name, List<Subject> subjects) {
		this.name = name;
		this.subjects = subjects;
	}
}

public class FlatMapHighestMarks {
	public static void main(String[] args) {

		List<Student> student = Arrays.asList(
				new Student("Kalpana", Arrays.asList(new Subject("Maths", 100), new Subject("Science", 100))),
				new Student("Rekha", Arrays.asList(new Subject("Physics", 80), new Subject("English", 60))),
				new Student("Bob", Arrays.asList(new Subject("Maths", 80), new Subject("Science", 100))));
		Optional<Subject> topSubject = student.stream().flatMap(s -> s.subjects.stream())
				.max(Comparator.comparingInt(s -> s.marks));
		if (topSubject.isPresent()) {
			System.out.println("Top Scoring Subject: " + topSubject.get().name);
			System.out.println("Marsk: " + topSubject.get().marks);
		} else {
			System.out.println("not found");
		}

	}

}
