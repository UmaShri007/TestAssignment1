package Assignment4;

//to count the number of consonants, vowels, special characters in a String.

public class INA4_Q4 {

	public static void count(String str) {
		
		int vowel_count= 0;
		int cons_count =0;
		int splChar_count=0;
		
		str = str.toUpperCase();
		
		char [] ch = str.toCharArray();
		
		for(int i=0;i<ch.length;i++) {
			
			if(ch[i]==65||ch[i]==69||ch[i]==73||ch[i]==79||ch[i]==85)
			{
				vowel_count++;
			}else if(ch[i]>=32 && ch[i]<=47||
					ch[i]>=58 && ch[i]<=64||
					ch[i]>=91 && ch[i]<=96||
					ch[i]>=123 && ch[i]<=126)
			{
				splChar_count++;
			}else
				cons_count++;
		}
		System.out.println("The number of vowels in given string "+str+" is "+vowel_count);
		System.out.println("The number of consonant in given string "+str+" is "+cons_count);
		System.out.println("The number of special character in given string "+str+" is "+splChar_count);
		
		
	}
	
	public static void main(String[] args) {

		String st = "Umamaheswari.V";
		
		count(st);
		
	}

}
