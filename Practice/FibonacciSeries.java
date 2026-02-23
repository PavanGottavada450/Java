package Practice;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		
		int a = 0;
		int b = 1;
		System.out.print(a+", "+b+", ");
		
		for(int i=1; i<=num; i++) {
			int next = a+ b;
			a=b;
			b=next;
			System.out.print(next+ ", ");
		}
		
		
	}

}
