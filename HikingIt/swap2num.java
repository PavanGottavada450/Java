package HikingIt;

import java.util.Scanner;

public class swap2num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("Before swap");
		System.out.println("a : " + a + ", " + "b : "+ b);
		
		int temp = a;
		a = b;
		b = temp;
		
		System.out.println("After swap");
		System.out.println("a : " + a + ", " + "b : "+ b);
		
	}

}
