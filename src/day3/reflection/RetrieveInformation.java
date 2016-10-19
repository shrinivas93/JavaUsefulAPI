package day3.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;

public class RetrieveInformation {
	public static void main(String[] args) throws ClassNotFoundException {
		Class<?> cls = Class.forName(String.class.getName());
		System.out.println("CLASS : " + cls);
		System.out.println("\tPACKAGE : " + cls.getPackage());
		System.out.println("\tSUPER CLASS : " + cls.getSuperclass());
		Class<?>[] interfaces = cls.getInterfaces();
		for (Class<?> intrfc : interfaces) {
			System.out.println("\tINTERFACE : " + intrfc);
		}
		System.out.println("\tMODIFIERS : "
				+ Modifier.toString(cls.getModifiers()));
		Constructor<?>[] constructors = cls.getConstructors();
		for (Constructor<?> constructor : constructors) {
			System.out.println("\tCONSTRUCTOR : " + constructor);
			Parameter[] parameters = constructor.getParameters();
			for (Parameter parameter : parameters) {
				System.out.println("\t\tPARAMETER : " + parameter);
			}
		}
		Method[] methods = cls.getMethods();
		for (Method method : methods) {
			System.out.println("\tMETHOD : " + method);
			int modifiers = method.getModifiers();
			System.out.println("\t\tMODIFIERS : "
					+ Modifier.toString(modifiers));
			Parameter[] parameters = method.getParameters();
			for (Parameter parameter : parameters) {
				System.out.println("\t\tPARAMETER : " + parameter);
			}
			System.out.println("\t\tRETURN TYPE : " + method.getReturnType());
		}
		Field[] fields = cls.getFields();
		for (Field field : fields) {
			System.out.println("\tFIELD : " + field);
			System.out.println("\t\tTYPE : " + field.getType());
		}
	}
}
