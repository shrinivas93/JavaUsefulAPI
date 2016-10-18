package day1.defaultmethods;

public class MyClass extends MyAbstractClass implements MyInterface {

	@Override
	public String method2() {
		return "Interface - Overridden";
	}

	@Override
	public String method3() {
		return "Abstract class - Overridden";
	}

}
