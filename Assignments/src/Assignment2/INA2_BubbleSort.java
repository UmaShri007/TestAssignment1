package Assignment2;

public class INA2_BubbleSort {

public static void main(String[] args) {
		
		int [] ar = {5,8,15,8,4,0,2,-12,12,90};
		
		int temp;
		
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
		System.out.println();
		for(int i=0;i<ar.length;i++) 
		{
			for(int j=0;j<ar.length-1-i;j++)
			{
				if(ar[j]>ar[j+1]) {
					
					temp =ar[j];
					ar[j]=ar[j+1];
					ar[j+1]=temp;
				}
					
				}
			}
		System.out.println("The array after sorting by bubble sort");
		for(int el:ar)
		{
			System.out.print(el+" ");
		}
		
}
}

