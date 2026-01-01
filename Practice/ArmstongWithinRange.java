package Practice;

import java.util.Scanner;

public class ArmstongWithinRange {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		
		for(int i = num1; i < num2; i++) {
			int rem = 0;
			int arm = 0;
			int temp = i;
			int num = i;
			int len = String.valueOf(temp).length();
			
			while(temp > 0) {
				rem = temp % 10;
				arm = arm + (int)(Math.pow(rem, len));
				temp = temp / 10;
			}
			
			if(arm == num) {
				System.out.print(i + " ");
			}
			
		}
		sc.close();
		
	}
}
