package Practice;

import java.util.Scanner;

public class Leapyear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		if(num%4 == 0 && num%100 != 0 || num%400 == 0 ) {
			System.out.print("Leap year");
		}else {
			System.out.print("Not a Leap year");
		}
	}

}
