package Assignments;

public class INA2_Q4 {
	
public static void main(String[] args) {
		
		int n = 13;
		
		for (int i = 0; i<=n;i++) {
			
			for (int j=0;j<=n;j++) {
				
				if(i==n||i+j>=n+n/2||i-j>=n/2)
					
					System.out.print("*");
				
					else
						System.out.print(" ");
			
				}
			System.out.println();
			
		}
}
}
