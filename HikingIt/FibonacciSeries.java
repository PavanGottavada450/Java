package HikingIt;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		int n1 = 0, n2 = 1, n3;
		
		for(int i=0; i<=num; i++) {
			System.out.print(n1+ " ");
			n3 = n1+n2;
			n1 = n2;
			n2 = n3;
		}
		
		
	}

}
