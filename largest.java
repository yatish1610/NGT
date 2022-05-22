package test;

public class largest {
	
	public static void main(String[] args) {
		
		int [] arr = {40, 5, 32, 855, 263, 70, 55};
		
		int max = 0;
		
		for(int i=0; i<arr.length; i++) {
			
			if(arr[i]>max)
				max = arr[i];
		}
		
		System.out.println("Maximum value in the array is: "+max);
	}

}
