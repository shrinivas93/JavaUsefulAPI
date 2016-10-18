package day1.methodreference;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample {
	public static void main(String[] args) {
		Student s1 = new Student("Shrinivas", 23);
		Student s2 = new Student("Nikita", 22);
		Student s3 = new Student("Mohini", 22);

		List<Student> students = new ArrayList<Student>();
		students.add(s1);
		students.add(s2);
		students.add(s3);

		students.sort(new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				return o1.getName().compareTo(o2.getName());
			}
		});
		System.out.println(students);

		students.sort(Student::compareByName);
		System.out.println(students);
	}
}