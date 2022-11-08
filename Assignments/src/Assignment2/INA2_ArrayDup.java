package Assignment2;

import java.util.Arrays;
import java.util.Scanner;

public class INA2_ArrayDup {
	
	public static void main(String[] args) {
		
//		int [] ar = {23,12,21,12,60,23,12,23,60};
		int [] ar = new int [9];
		Scanner scan = new Scanner(System.in);
		
		for(int i=0;i<ar.length;i++) {
			System.out.println("Enter the number: ");
			ar[i]=scan.nextInt();
		}
		
 		Arrays.sort(ar);
 		
// 		for(int elem:ar) {
// 			System.out.println(elem+" ");
// 		}
		
		boolean flag = false;
		int temp = 0;
		
		System.out.println("The duplicate elements in array are: ");
		for(int i = 0;i<ar.length;i++) {
			
			for(int j = i+1;j<ar.length;j++) {
				
				if(ar[i]==ar[j] && i!=j) {
					
					if(temp!=ar[i]) { //works if array sorted
					 temp = ar[j];
					System.out.print(ar[i] + " ");
					flag=true;
//					break;
					}	
				}
				}
		}
				if(flag==false) {
			System.out.println("No duplicates found");
		}
}
}

