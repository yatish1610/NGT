package test;

import java.util.Scanner;

public class reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sentence");
		String sentence = sc.nextLine();
		//String sentence = "Nice Picture";
	    String reversed = reverse(sentence);
	    System.out.println("The reversed sentence is: " + reversed);
	  }

	  public static String reverse(String sentence) {
	    if (sentence.isEmpty())
	      return sentence;

	    return reverse(sentence.substring(1)) + sentence.charAt(0);
	}

}