package Practice;

import java.util.Scanner;

public class FactorNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		for(int i =2; i< num;i++) {
			if(num%i == 0) {
				System.out.print(i+ ", ");
			}
		}
	}

}
