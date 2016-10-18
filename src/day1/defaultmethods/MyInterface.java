package day1.defaultmethods;

public interface MyInterface {
	public default String method1() {
		return "Interface - Default";
	}
	public String method2();
}
