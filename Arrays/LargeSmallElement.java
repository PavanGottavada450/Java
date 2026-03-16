package Arrays;

import java.util.Scanner;

public class LargeSmallElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number of elements : ");
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		
		System.out.print("Enter array elements :");
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
//		int arr[] = {1,2,8,4,5};
	    
	    int small = arr[0];
	    int large = arr[0];
	    
	    for(int i=0; i<arr.length; i++){
	        if(small > arr[i]){
	            small = arr[i];
	        }
	    }
	    
	    for(int i=0; i<arr.length; i++){
	        if(large < arr[i]){
	            large = arr[i];
	        }
	    }
	    
	    System.out.println("smallest number : " + small);
	    System.out.print("largest number : " + large);
		
	}

}
