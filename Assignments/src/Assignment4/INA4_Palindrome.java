package Assignment4;

// enhance by 1. converting lower to upper without using inbuilt method
//			  2. without using charAt(i),by converting it to array and looping maybe..check

public class INA4_Palindrome {

	public static void main(String[] args) {
		
//		String s1 ="2552";
//		
//		String s2 ="";
//		
//		for(int i=s1.length()-1;i>=0;i--) {
//			
//			s2=s2+s1.charAt(i);
//		}
//
//		if(s1.equals(s2)) 
//		{
//			System.out.println(s1 + " is a palindrome");
//		}
//		else
//		{
//			System.out.println(s1 + "is not a palindrome");
//		}
		
// if 2552 is an integer
		
		int num = 2552;
		int rev_num = 0;
		int remainder=0;
		
		int temp = num;
		
		while(temp > 0)
		{
		remainder = temp %10;
		rev_num	= (rev_num*10) +remainder;
		temp = temp/10;
		}
		
		if(num==rev_num)
		{
			System.out.println("Number "+num + "  is a palindrome");
		}
		else
		{
			System.out.println("Number " +num + " is not a palindrome");
		}
	}
	}