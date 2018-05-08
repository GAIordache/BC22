package regex1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExExMain {
	static String[] phones = { "+40-722-111222", "+40-723-111333", "+39-555-999999", "+39-5565-99999"

	};

	public static void main(String[] args) {
		String phonePattern = "\\+(\\d{2,3})-(\\d{3})-(\\d{6})";
		Pattern pattern = Pattern.compile(phonePattern);
		for (String phoneNo : phones) {
			Matcher m = pattern.matcher(phoneNo);
			if (m.matches()) {
				System.out.println(phoneNo + " OK");
				System.out.println("Country code:" + m.group(1));
				System.out.println("Carrier code:" + m.group(2));
				System.out.println("Number:" + m.group(3));

			} else {
				System.out.println("Not a number : " + phoneNo);

			}
		}
	}

}
