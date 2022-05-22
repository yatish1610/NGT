package test;

public class average {
	public static void main(String[] args) {		 
        
        int[] array = { 2,4,6,8,10,12,14,16 };// create an array
  
        int length = array.length;// getting array length
        
        int sum = 0;// default sum value
     
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
 
        double average = sum / length;
         
        System.out.println("Average of array : "+average);
 
    }
}