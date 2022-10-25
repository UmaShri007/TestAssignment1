package Assignments;

public class INA1_Q1 {

	public static void main(String[] args) {
		
		int n = 6;
		for (int i = 0; i<=n;i++) {
			for (int j=0;j<=n;j++) {
				if(j==(n+1)/2) {
					System.out.print("*");
				}
					else
						System.out.print(" ");
				}
		
			for (int j=0;j<=n;j++) {
				if (j==0||j==n||i==j) {
					System.out.print("*");
				}
					else
						System.out.print(" ");
				}
			System.out.print(" ");
			for (int j=0;j<=n;j++) {
				if(i==0||i==(n+1)/2||i==n||j==0) {
					System.out.print("*");
				}
					else
						System.out.print(" ");
				}
			for (int j=0;j<=n;j++) {
				if (j==1&&i<n||j==n&&i<n||i==n&&j<n&&j>1) {
					System.out.print("*");
				}
					else
						System.out.print(" ");
				}
			System.out.print(" ");
			for (int j=0;j<=n;j++) {
				if (j==0||i==0&&j<(3*n)/4||i==(n+1)/2&&j<(3*n)/4||j==(3*n)/4&&i<(n+1)/2&&i!=0||(i-j==(n+1)/2)) {
					System.out.print("*");
				}
					else
						System.out.print(" ");
				}
			for (int j=0;j<=n;j++) {
				if(i==0&&j>0&&j<n||i==n&&j<n&&j>0||j==0&&i>0&&i<n||j==n&&i<n&&i!=0) {
					System.out.print("*");
				}
					else
						System.out.print(" ");
				}
			System.out.print(" ");
			for (int j=0;j<=n;j++) {
				if (j==0||j==n||i==j) {
					System.out.print("*");
				}
					else
						System.out.print(" ");
				}
			System.out.println();
			}
			}
			}
		
	


