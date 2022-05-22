package test;

public class swpping {
	public static void main(String[] args) {    
		int x=8, y=12;
        System.out.println("before swapping numbers: "+"x = "+x +" and y = "+ y);  
       //Swapping 
        x = x + y;   
        y = x - y;   
        x = x - y;   
        System.out.println("After swapping: "+"x = "+x +" and y = "+ y);   
    } 

}
