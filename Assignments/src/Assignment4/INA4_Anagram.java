package Assignment4;

import java.util.Arrays;

//Anagram: a word or phrase formed by rearranging the letters of a different word or phrase, 
//typically using all the original letters exactly once. eg: keep and peek, a gentle man and a elegant man

// Enhance by removing all inbuilt methods

public class INA4_Anagram {

	public static void main(String[] args) {

		String s1 = "a gentle man";				//"race"
		String s2 = "an elegant man";				//"care"
		
// if incoming strings are in different case, convert them to either low or upper
		
		s1= s1.replace(" " , "");
		s2= s2.replace(" " , "");
		
// converting the string to array
		
		char [] ch1 = new char [s1.length()];
		
		for(int i=0;i<ch1.length;i++) 
		{
			ch1[i]=s1.charAt(i);
		}
		char [] ch2 = new char [s2.length()];
		
		for(int i=0;i<ch2.length;i++)
		{
			ch2[i]=s2.charAt(i);
		}
		
//	sorting the given string using bubble sort
		
		char temp;
		for(int i=0;i<ch1.length;i++) 
		{
			for(int j=0;j<ch1.length-1;j++)
			{
				if(ch1[j]>ch1[j+1])
				{
					temp = ch1[j];
					ch1[j]=ch1[j+1];
					ch1[j+1]=temp;
				}
			}
		}
		
		for(char element:ch1) {
			System.out.print(element);
		}
		System.out.println();
// 	sorting the given string using selection sort
		
		for(int i =0;i<ch2.length;i++)
		{
			char smallest = ch2[i];
			int small_index = i;
			for(int j=i+1;j<ch2.length;j++)
			{
				if(smallest>ch2[j]) 
				{
					small_index=j;
					smallest = ch2[j];
				}
			}
			char temp1 = ch2[i];
			ch2[i]=ch2[small_index];
			ch2[small_index]=temp1;
		}
		for(char element:ch2) {
			System.out.print(element);
		}
		System.out.println();
		
//	to compare two arrays
		
		boolean flag = false;
		
		for(int i =0;i<ch1.length;i++)
		{
			for(int j=0;j<ch2.length;j++)
			{
				if(ch1[i] == ch2[j] && ch1.length == ch2.length)
					flag=true;
			}
		}
		
		if(flag==true)
			System.out.println("Anagram");
		else
			System.out.println("Not an Anagram");

		
//		if(Arrays.equals(ch1, ch2))
//				System.out.println("Anagram");
//		else
//				System.out.println("Not an Anagram");
	}
}
