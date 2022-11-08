package Assignment2;

// to find an array is a subset of another array

public class INA2_Q6 {
	
	public static void main(String[] args) {
		
		int [] array1 = {12,3,45,6,8};
		int [] array2 = {45,8,12,6};
		
		boolean flag = true;
		
		int i=0,j=0;
		
		for(i=0;i<array2.length;i++) {
			
			if(array2.length>array1.length)
				flag=false;
			
			for(j=0;j<array1.length;j++) 
			
				if(array2[i]==array1[j])
					break;
				if(j==array1.length)
					flag=false;
		}
		
		if(flag)
			System.out.println("subset");	
		else
			System.out.println("not subset");
		}

}
