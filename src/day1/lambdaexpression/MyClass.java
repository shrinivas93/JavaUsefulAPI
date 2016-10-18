package day1.lambdaexpression;

public class MyClass {
	public static void main(String[] args) {
		MyInterface returnVal1 = (name, n) -> {
			for (int i = 0; i < n; i++) {
				System.out.println(name);
			}
			return name;
		};
		MyInterface returnVal2 = (String name, int n) -> {
			String val = "";
			for (int i = 0; i < n; i++) {
				val = val + name;
			}
			return val;
		};
		MyInterface returnVal3 = (String name, int n) -> name + "-" + n;

		String val1 = returnVal1.method("Hello", 5);
		System.out.println("val1 - " + val1);
		String val2 = returnVal2.method("Hello", 10);
		System.out.println("val2 - " + val2);
		String val3 = returnVal3.method("Hello", 10);
		System.out.println("val3 - " + val3);
	}
}
