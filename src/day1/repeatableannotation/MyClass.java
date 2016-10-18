package day1.repeatableannotation;

import java.awt.Color;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public class MyClass {

	@day1.repeatableannotation.Color(r = 128)
	@day1.repeatableannotation.Color(g = 128)
	@day1.repeatableannotation.Color(b = 128)
	public static Color color;

	public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, SecurityException {
		System.out.println(color);
		Class<?> classname = Class.forName(MyClass.class.getName());
		System.out.println(classname);
		Field field = classname.getDeclaredField("color");
		System.out.println(field);
		Annotation[] annotations = field.getDeclaredAnnotations();
		System.out.println(annotations.length);
		for (Annotation annotation : annotations) {
			System.out.println(annotation.annotationType());
		}
	}
}
