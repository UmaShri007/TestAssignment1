package Assignment4;

import java.util.Scanner;

// to print duplicates in a given String

public class INA4_PrintDuplicate {
	
	public static void main(String[]args) {
		
//		String s = "Narayanan";
		
//		implement a logic to get the i/p string from user
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String s = scan.nextLine();
		s = s.toLowerCase();
		
//		char []	ch = s.toCharArray(); 
		
//       logic to convert it into array without inbuilt method
		
		char []	ch = new char[s.length()];
		
		for(int i =0;i<s.length();i++) {
			
			ch[i]= s.charAt(i);
		}
		
		for(char ele:ch) 
		{
			System.out.print(ele);
		}
		
		char temp=' ';
		System.out.println("\nThe duplicates in string "+s+" are ");
		
		for(int i=0;i<ch.length;i++)
		{
		
			for(int j=i+1;j<ch.length;j++) 
			{
				if(ch[i]==ch[j] && ch[i]!=temp) //works for two consecutive dups,else logic change required

				{
					temp=ch[j];
					System.out.print(ch[j]+" ");
					break;
				}
			}
			
			}
		}
	}

