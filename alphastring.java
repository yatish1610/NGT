package test;

public class alphastring {

	
	public static void main(String[] args) {
		
		String s1 = "Error 404-Not found";
		
		System.out.println("The number part is: " +s1.replaceAll("[^0-9]", "" ));
		
	}
}