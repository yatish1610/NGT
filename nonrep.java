package test;

public class nonrep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        String str ="ishit";

        for(char i :str.toCharArray()){
        if ( str.indexOf(i) == str.lastIndexOf(i)) {
            System.out.println("First non-repeating character is: "+i);
            break;
        }
        }

	}

}