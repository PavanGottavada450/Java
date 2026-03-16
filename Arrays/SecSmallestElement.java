package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SecSmallestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);	
		System.out.println("Enter array size : ");
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		System.out.println("Enter array elements : ");
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		
		System.out.println("Second Smallest Element : " + arr[1]);
		System.out.print("Second Largest Element : " + arr[n-1]);
	}
	
}
