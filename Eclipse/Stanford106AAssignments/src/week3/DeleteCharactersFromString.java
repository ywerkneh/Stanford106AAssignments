package week3;

import acm.program.ConsoleProgram;

public class DeleteCharactersFromString extends ConsoleProgram {
	
	public void run() {
		System.out.println(" All occurences of 'a' removed from the string asdasdjaksdkasdasda gives : " 
							+ removeAllOccurrences("\n asdasdjaksdkasdasda", 'a'));
		

	}
	
		private String removeAllOccurrences(String str, char ch) {
			String result = "";
			for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ch) {
			result += str.charAt(i);
			}
			}
			return result;
			}
	}

