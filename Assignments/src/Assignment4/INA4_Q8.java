package Assignment4;

import java.util.Arrays;

// to find the maximum occurring character in a String.

public class INA4_Q8 {
	
	public static void main(String[] args) {

		String str = "Life is beautiful";
		str=str.replaceAll("\\s", "");
		str = str.toUpperCase();
		System.out.println(str);
		
		char [] ch = str.toCharArray();
		Arrays.sort(ch);
		int[ ] arr = new int[26];
		int max_count=0;
		char max_occuringCharacter=' ';
		
		for(int i=0;i<ch.length;i++)
		{
			int index = ch[i]-65;
			arr[index]++;
		}
		
		for(int i = 0;i<arr.length;i++)
		{
			if(arr[i]>max_count) {
				max_count=arr[i];
				max_occuringCharacter=(char) (i+65);
			}
		}
		System.out.println(max_occuringCharacter+"::"+max_count);
	}
}
			
		
			
			


