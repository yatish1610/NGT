package test;

import java.util.Scanner;

public class alphabet {
	
	public static void main (String [] args) {
		
         char a;
         Scanner sc =new Scanner(System.in);
         System.out.println("Enter the character: ");
         a = sc.next().charAt(0);
         sc.close();
		
        if((a>='A' && a<='Z') || (a>='a' && a<='z'))	
            System.out.println("Alphabet");
        else
            System.out.println("Not a Alphabet");
    }
	}