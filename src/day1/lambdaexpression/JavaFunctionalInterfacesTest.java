package day1.lambdaexpression;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class JavaFunctionalInterfacesTest {
	public static void main(String[] args) {
		String[] names = { "Hello", "Hi", "Everyone" };
		List<String> list = Arrays.asList(names);

		Collections.sort(list, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2) * -1;
			}
		});
		System.out.println(list);

		Collections.sort(list, (s1, s2) -> {
			return s1.compareTo(s2);
		});
		System.out.println(list);

	}
}
