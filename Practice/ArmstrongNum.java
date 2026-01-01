package Practice;

import java.util.Scanner;

public class ArmstrongNum {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		int rem = 0;
		int arm = 0;
		int temp = num;
		int len = String.valueOf(num).length();
		
		while(num > 0) {
			rem = num % 10;
			arm = arm + (int) ( Math.pow(rem, len));
			num = num / 10;
		}
		
		if (arm == temp) {
			System.out.print("armstrong number");
		}else {
			System.out.print("not a armstong number");
		}
		
	}
}
