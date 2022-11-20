package Assignment4;

//to find if String contains all unique characters.


public class INA4_Q7 {

	 boolean uniqueCharacter(String string) {
		 
		 string = string.toLowerCase();
		 
			// converting string to character array
			char [] ch = new char[string.length()];
			
			for(int i=0;i<string.length();i++) {
				
				ch[i]=string.charAt(i);
			}
			
			//to find if String contains all unique character
			
			for(int i=0;i<ch.length;i++) 
			{
				for(int j=i+1;j<ch.length;j++) 
				{
					
					if (ch[i]==ch[j]) 
					{
						return false;
					}
				}
					
			}
			
			return true;
			
		}
	 
	public static void main(String[] args) {

		String str = "iNeuron Technology";
		
		INA4_Q7 obj = new INA4_Q7();
		boolean value = obj.uniqueCharacter(str);
		
		if(value==true)
		System.out.println("The string "+str+" is unique");
		else
			
		System.out.println("The string "+str+" has duplicate characters,it's not unique");
}
}