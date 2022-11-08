package Assignment2;

import java.util.Scanner;

// Selection Sort/Exchange Selection Sort: 
//the smallest element in 1st position,second smallest in 2nd position and so on

public class INA2_SelectionSort {
	
public static void main(String[] args) {
		
		int [] ar = {5,8,15,8,4,0,2,-12,12,90};
//		int [] ar = new int [9];
//		Scanner scan = new Scanner(System.in);
//		
//		for(int i=0;i<ar.length;i++) {
//			System.out.println("Enter the number: ");
//			ar[i]=scan.nextInt();
//		}
		System.out.print("The Array before selection sort ");
		for(int elem:ar) {
			System.out.print(elem+" ");
		}
		
		int smallest;
		int small_index;
		for (int i = 0;i<ar.length;i++) {
				
			smallest = ar[i];
			small_index = i;
			
			for (int j = i+1;j<ar.length;j++) {
				
				if(smallest>ar[j]) {
					smallest=ar[j];
					small_index=j;
				}
			}
			
			int temp = ar[i];
			ar[i]=ar[small_index];
			ar[small_index]=temp;
}
		System.out.println();
		System.out.print("The Array after selection sort ");
		for(int elem:ar) {
		System.out.print(elem+ " ");
}
			
	}
}
