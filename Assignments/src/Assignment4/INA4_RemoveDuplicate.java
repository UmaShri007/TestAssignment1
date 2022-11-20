package Assignment4;

import java.util.Scanner;

// to remove duplicates in a given String

public class INA4_RemoveDuplicate {
	
	public static void main(String[]args) {
		
		String s = "ababababbbbccd112234";
		String unique="";
		
		s=s.toLowerCase();
		boolean dupFlag;
		
		char []	ch = s.toCharArray(); //implement a logic to convert it into array without inbuilt method
		
		for(int i=0;i<ch.length;i++)
		{
			dupFlag=false;
			for( int j=i+1;j<ch.length;j++) 
			{
				if(ch[i]==ch[j] ) 
				{
					dupFlag=true;
					break;
				}
			}
			if(dupFlag==false) {
				
				unique=unique+ch[i];
			}
			
		}
		System.out.println(unique);
	}
}

