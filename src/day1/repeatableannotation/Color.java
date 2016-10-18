package day1.repeatableannotation;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@Repeatable(Colors.class)
public @interface Color {
	int r() default 255;

	int g() default 255;

	int b() default 255;
}
