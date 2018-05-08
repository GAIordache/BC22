package regex2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainEx {
	// A SE FACE PARSING LA example.log, si sa se extraga (afiseze) pentr fiecare linie de log
	// - IP browser
	// - Date (tot string dar fara paranteze)
	// - Ultimul camp - numar bytes trimisi inapoi la browser in pagina html
	// Hint
	// BufferedReader - pentru fisier - readLine
	// Pattern cu pattern matching pentru fiecare linie
	
	// Hint - google search - apache log regex

	public static void main(String[] args) {
		String logLine = new String("64.242.88.10 - - [07/Mar/2004:16:30:29 -0800] \"GET /twiki/bin/attach/Main/OfficeLocations HTTP/1.1\" 401 12851");
		String logLinePattern ="(\\d{2,4}\\.\\d{2,4}\\.\\d{2,4}\\.\\d{2,4}) - - \\[(.*)\\] \\\"(.*)\" (\\d{3}) (\\d+)";
		
		
		
		Pattern pattern = Pattern.compile(logLinePattern);
		Matcher matcher = pattern.matcher(logLine);
		
		if (!matcher.matches()) {
			System.out.println("entry-ul nu este bun");	
		}
		else {
			System.out.println("IP Address: " + matcher.group(1));
			System.out.println("Date&Time: " + matcher.group(2));
			System.out.println("Bytes Sent: " + matcher.group(5));
		}
		

	}

}
