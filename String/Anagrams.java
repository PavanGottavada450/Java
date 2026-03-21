package String;

import java.util.Arrays;

public class Anagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = "listen";
		String str2 = "silent";
		
		// Convert to lowercase to ignore case sensitivity
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();

		// Remove spaces (for phrases like "listen" & "silent")
		str1 = str1.replaceAll("\\s", "");
		str2 = str2.replaceAll("\\s", "");
 		
		// convert to char array
		char[] chars1 = str1.toCharArray();
		char[] chars2 = str2.toCharArray();
		
		// sort
		Arrays.sort(chars1);
		Arrays.sort(chars2);
		
		
		if(Arrays.equals(chars1, chars2)) {
			System.out.print("anagram");
		}else {
			System.out.print("not a anagram");
		}
		
	}

}
