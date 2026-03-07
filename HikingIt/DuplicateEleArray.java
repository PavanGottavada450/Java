package HikingIt;

import java.util.Scanner;

public class DuplicateEleArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Scanner sc = new Scanner(System.in);
		
		int arr[] = {1,2,3,2,4,5,3};

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    System.out.println("Duplicate: "+arr[j]);
                }
            }
        }
		
	}

}
