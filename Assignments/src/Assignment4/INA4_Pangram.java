package Assignment4;

// Pangram: a sentence using every letter of a given alphabet at least once
// eg1:  A quick brown fox jumps over the lazy dog //33 letters
// eg2:  Pack my box with five dozen liquor jugs //32 letters

public class INA4_Pangram {
	
	public static void main(String[] args) {

		String s1="THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG";
		
		s1 = s1.replace(" ", "");
		
		boolean flag = false;
		
		char [] ch = new char [s1.length()];
		
		for(int i=0;i<ch.length;i++) 
		{
			ch[i]=s1.charAt(i);
		}
		
		int [] arr = new int [26];
		
		for(int i=0;i<ch.length;i++)
			
		{
			int index = ch[i]-65;
			arr[index]++;  // ASCII of T is 84, now 84-65 = 19 , arr[19] = 0--->arr[19]++=1
		}
	
		for(int i=0;i<arr.length;i++)
	
		{
			if(arr[i]==0)
			{
				System.out.println("Its not a pangram");
				flag = true;
				break;
			}
		}


		if(flag==false)
		{
			System.out.println("Pangram");
		}
	
	}

}
