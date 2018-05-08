package rb;

import java.util.Locale;
import java.util.ResourceBundle;

public class Main {

	public static void main(String[] args) {
		System.out.println("Current Locale: " + Locale.getDefault());
		ResourceBundle mybundle = ResourceBundle.getBundle("MyMessages");

		// read MyLabels_en_US.properties
		System.out.println("Say how are you in US English: " + mybundle.getString("cancel"));
		Locale.setDefault(new Locale("ro","RO"));
		mybundle = ResourceBundle.getBundle("MyMessages");
		System.out.println("Say how are you in Romanian: " + mybundle.getString("cancel"));

	}

}
