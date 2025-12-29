package Practice;

import java.util.Scanner;

public class PrimeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		int count = 0;
		
		for(int i=2; i<num; i++) {
			if(num % i == 0) {
				count++;
			}
		}
		
		if(count > 0) {
			System.out.println(num + " is not 9a prime number");
		}else {
			System.out.println(num + " is a prime number");
		}
		
		
		sc.close();
	}

}
