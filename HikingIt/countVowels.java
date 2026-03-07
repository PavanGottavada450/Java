package HikingIt;

import java.util.Scanner;

public class countVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		int count = 0;
		
		for(int i=0; i<str.length(); i++) {
			char ch = Character.toLowerCase(str.charAt(i));
			
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
				count++;
			}
		}
		System.out.print("Vowels count : " + count);
	}

}
