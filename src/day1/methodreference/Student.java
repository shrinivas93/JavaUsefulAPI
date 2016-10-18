package day1.methodreference;

public class Student {
	private String name;
	private Integer age;

	public Student(String name, Integer age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}

	public static int compareByName(Student s1, Student s2) {
		return s1.getAge() < s2.getAge() ? 1 : (s1.getAge() > s2.getAge() ? -1
				: s1.getName().compareTo(s2.getName()));
	}

}