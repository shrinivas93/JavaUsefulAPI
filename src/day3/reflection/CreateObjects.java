package day3.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class CreateObjects {
	public static void main(String[] args) throws ClassNotFoundException,
			NoSuchMethodException, SecurityException, InstantiationException,
			IllegalAccessException, IllegalArgumentException,
			InvocationTargetException {
		Class<?> cls = Class.forName(String.class.getName());
		Constructor<?> constructor = cls.getConstructor(String.class);
		Object newInstance = constructor.newInstance("Shrinivas");
		System.out.println(newInstance);
		System.out.println(newInstance.getClass().getMethod("length")
				.invoke(newInstance));
	}
}
