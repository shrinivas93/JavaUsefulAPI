package day1.typeannotation;

public class MyClass {

	public static void main(String[] args) {
		// @NonNull
		String name = method("Shrinivas");
		System.out.println(name.length());
		name = method(null);
		System.out.println(name.length());
	}

	public static String method(String name) {
		return name;
	}
}
