package week3;

import acm.program.ConsoleProgram;

public class AddCommasToNumberStrings extends ConsoleProgram {

	public void run() {
		System.out.println(addCommasToNumericString("1000"));
	}

	private String addCommasToNumericString(String digits) {
		String result = "";
		int len = digits.length();
		int nDigits = 0;
		for (int i = len - 1; i >= 0; i--) {
		result = digits.charAt(i) + result;
		nDigits++;
		// we also need i > 0 so we don’t have a comma before the
		if (((nDigits % 3) == 0) && (i > 0)) {
		result = "," + result;
		}
		}
		return result;
		
		}
}
