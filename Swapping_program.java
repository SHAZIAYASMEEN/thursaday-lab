package javaproject;

public class Swapping_program {

	public static void main(String[] args) {
		// swapping of two numbers with out using third variable
		int m=30;
		int n=50;
		System.out.println("print the values before swapping"+" \n"+m+"\n"+n);
		m=m+n;
		
		n=m-n;
			
		m=m-n;
		System.out.println("print the values after swapping"+" \n"+m+"\n"+n);
		
	}

}
