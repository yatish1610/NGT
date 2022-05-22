package test;

public class duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "yatishchaudhary";
		System.out.println("String with duplicate values:"+str);
		String temp = "";
		for (int i = 0; i < str.length(); i++) {

			for (int j = i + 1; j < str.length(); j++) {

				if (str.charAt(i) == str.charAt(j))
					break;
				if (j == str.length() - 1) {
					temp = temp + str.charAt(i);

				}
			}
		}
		System.out.println("String after eliminating duplicates :" + temp);
	}
}