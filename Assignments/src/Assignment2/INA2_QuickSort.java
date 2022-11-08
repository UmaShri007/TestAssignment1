package Assignment2;

import java.util.Arrays;

// QuickSort;setting first element as pivot

public class INA2_QuickSort {
	
		void quickSort(int [] a,int low,int high) {
			
			if (low<high) {
				
				int pivot = a[low];
				int i = low;
				int j = high;
				
				while(i<j) {
					
					i+=1;
					
					while(i<=high && a[i]<pivot ) 
						i++;
					while( j>=low && a[j]>pivot )
						j--;
					if(i<j && i<=high)
					swap(a,i,j);
					
				}
				swap(a,low,j);
				quickSort(a,low,j-1);
				quickSort(a,j+1,high);
				
			}
		}
		
		void swap(int [] ar,int x, int y) {
			
			int temp = ar[x];
			ar[x]=ar[y];
			ar[y]=temp;
		}
		
	public static void main(String[] args) {
		
		int [] arr = {12,21,6,26,7,14,11,43,19,34};
		INA2_QuickSort obj = new INA2_QuickSort();
		
		obj.quickSort(arr,0,arr.length-1);
		for(int value:arr) {
			System.out.print(value+" ");
		}
	}

}
