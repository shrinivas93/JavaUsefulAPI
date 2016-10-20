package day4.internationalization;

import java.util.Locale;
import java.util.ResourceBundle;

public class MyMain {
	public static void main(String[] args) {
		ResourceBundle bundle = ResourceBundle.getBundle("messages");
		showData(bundle);

		Locale englishLocale = new Locale("en", "US");
		ResourceBundle englishBundle = ResourceBundle.getBundle("messages",
				englishLocale);
		showData(englishBundle);

		Locale frenchLocale = new Locale("fr", "FR");
		ResourceBundle frenchBundle = ResourceBundle.getBundle("messages",
				frenchLocale);
		showData(frenchBundle);

		Locale germanLocale = new Locale("de", "DE");
		ResourceBundle germanBundle = ResourceBundle.getBundle("messages",
				germanLocale);
		showData(germanBundle);
	}

	public static void showData(ResourceBundle bundle) {
		System.out.println(bundle.getLocale().getDisplayCountry() + " : "
				+ bundle.getLocale().getDisplayLanguage());
		System.out.println("greetings : " + bundle.getString("greetings"));
		System.out.println("farewell : " + bundle.getString("farewell"));
		System.out.println("msg : " + bundle.getString("msg"));
		System.out.println();
	}
}
