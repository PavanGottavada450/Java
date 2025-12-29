package Practice;

import java.util.ArrayList;
import java.util.Scanner;

public class PrimeNumWithinRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		ArrayList<Integer> arr = new ArrayList<>();
		
		
		for(int i=num1;i<=num2;i++) {
			int count = 0;
			for(int j=2;j<=i;j++) {
				if(i%j == 0) {
					count++;
				}
			}
			if(count < 2) {
				arr.add(i);
			}
		}
		
		System.out.print("the Prime numbers of "+ num1 + " and " + num2 + "are : " + arr);
		
		sc.close();
		
	}

}
