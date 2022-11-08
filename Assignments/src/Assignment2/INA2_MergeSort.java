package Assignment2;

public class INA2_MergeSort {
	
	void divideArray(int[] inputAr)
	{
		int inputAr_length = inputAr.length;
		
		if (inputAr_length<2) {
			return;
		}
		
		int midIndex = inputAr.length/2;
		int [] leftHalf = new int [midIndex];
		int [] rightHalf = new int [inputAr_length-midIndex];
		
		for(int i = 0; i<midIndex;i++) 
		{
			leftHalf[i] = inputAr[i];
		}
		
//		System.out.println();
//		System.out.println("LeftHalf: ");
//		for(int elem:leftHalf) {
//			System.out.print(elem+" ");
//	}
		for(int i = midIndex; i<inputAr.length;i++) 
		{
			rightHalf[i-midIndex] = inputAr[i];
		}
		
//		System.out.println();
//		System.out.println("RightHalf: ");
//		for(int elem:rightHalf) {
//			System.out.print(elem+" ");
//	}
		divideArray(leftHalf);
		divideArray(rightHalf);
		mergeArray(inputAr,leftHalf,rightHalf);
	}
	
	 void mergeArray(int[] mergAr, int[] leftAr, int[] rightAr) {
		 
		 int leftSize = leftAr.length;
		 int rightSize = rightAr.length;
		 int i=0, j=0,k=0;
		 
		 while(i < leftSize && j < rightSize) {
			 
			 if(leftAr[i] <= rightAr[j]) {
			 mergAr[k] = leftAr[i];
			 i++;
			 }
			 else {
				 mergAr[k] = rightAr[j];
			 j++;
	} 
			 k++;
		 }
		 while (i<leftSize) {
			 mergAr[k++] = leftAr[i++];
			 }
		 while (j<rightSize) {
			 mergAr[k++] = rightAr[j++];
		 }
	 }
	 
	void displayArray(int [] inputArr) 
	{
		for(int elem:inputArr) {
			System.out.print(elem+" ");
		}
	}
	
	public static void main (String [] args) 
	{
		int [] inputArray	= {38,27,43,3,9,82,10};
		
		INA2_MergeSort obj = new INA2_MergeSort();
		
		System.out.println("Before Sorting: ");
		obj.displayArray(inputArray);
		
		obj.divideArray(inputArray);
		
		System.out.println("\nAfter Sorting: ");
		obj.displayArray(inputArray);
		
	}
}