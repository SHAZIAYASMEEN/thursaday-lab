package javaproject;
import java.util.Scanner;
	public class Bonus{
	public static void main(String[] args) {
			// TODO Auto-generated method stub
	    int joining_year,current_year;
	    
	    Scanner sc=new Scanner(System.in);
	    System.out.println("enter employee joining_year:");
	    joining_year=sc.nextInt();
	    System.out.println("enter employee current_year:");
	    current_year=sc.nextInt();
	    if((current_year-joining_year)>3);
	        System.out.println("employee will get bonus of 3000rs");
	        
	    	System.out.println("no bonus");
	    
	    
		}

	}

