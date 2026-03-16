package String;

import java.util.Arrays;

public class Anagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = "listen";
		String str2 = "silent";
 		
		char[] chars1 = str1.toCharArray();
		char[] chars2 = str2.toCharArray();
		
		Arrays.sort(chars1);
		Arrays.sort(chars2);

		if(Arrays.equals(chars1, chars2)) {
			System.out.print("anagram");
		}else {
			System.out.print("not a anagram");
		}
		
	}

}
