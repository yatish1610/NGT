package test;

public class conversion {
	public static void main(String args[])
	   {
	      // converting Char to string
	     /* char ch = 'c';
	      String str = Character.toString(ch);
	      System.out.println("String is: "+str);*/
	      
	      //converting string to character
	      String str = "Yatish";
	      for(int i=0; i<str.length();i++){
	        char ch = str.charAt(i);
	        System.out.println("Character at "+i+" Position: "+ch);
	   }
	      
	   
	}
}