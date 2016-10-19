package day3.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyMain {
	public static void main(String[] args) {
		Pattern pattern = Pattern
				.compile("([a-z0-9._%+-]+)@([a-z0-9.-]+)\\.([a-z]{2,6})");
		Matcher matcher = pattern.matcher("ssshukla1993@gmail.com");
		System.out.println(matcher.matches());
		for (int i = 0; i <= matcher.groupCount(); i++) {
			System.out.println(matcher.group(i));
		}
	}
}
