package test;

public class concatenate {


	public static void main(String[] args)
	{
		
		int a[] = { 33, 95, 61 };// first array
		
		int b[] = { 85, 52, 53, 60, 65 };// second array
		
		int a1 = a.length;// determining length of first array
		
		int b1 = b.length;// determining length of second array

		int c1 = a1 + b1;// resultant array size

		int[] c = new int[c1];// Creating a new array

		// Loop to store the elements of first
		// array into resultant array
		for (int i = 0; i < a1; i = i + 1) {
			// Storing the elements in
			// the resultant array
			c[i] = a[i];
		}

		// Loop to concat the elements of second
		// array into resultant array
		for (int i = 0; i < b1; i = i + 1) {

			// Storing the elements in the
			// resultant array
			c[a1 + i] = b[i];
		}

		// Loop to print the elements of
		// resultant array after merging
		for (int i = 0; i < c1; i = i + 1) {
			
			// print the element
			System.out.println(c[i]);
		}
	}
}