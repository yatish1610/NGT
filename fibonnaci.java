package test;

public class fibonnaci {
	public static void main(String args[])
	{  
	 int a=2,b=3,temp,i,count=20;  
	 System.out.print(a+" "+b);//printing 2 and 3  
	  
	 for(i=5;i<count;++i)//loop starts from 5 because 2 and 3 are already printed  
	 {  
	  temp=a+b;  
	  System.out.print(" "+temp);  
	  a=b;  
	  b=temp;  
	 }  

	}
}

