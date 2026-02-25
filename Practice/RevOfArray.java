package Practice;

import java.util.Scanner;

public class RevOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int arr[] = {10, 20, 30, 40, 50};
		
		int n=arr.length;
		
		for(int i=n-1;i>=0;i--) {
			System.out.print(arr[i]+ " ");
		}
		
	}

}
