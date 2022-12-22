package javaproject;
import java.util.Scanner;
public class NumberIsDivisibleBy4And11 {
public static void main(String[] args) {
		// TODO Auto-generated method stub
	 int num;
		   Scanner sc=new Scanner(System.in);
		     System.out.print("Enter any value : ");
		  num=sc.nextInt();
		   if(num%4==0&&num%11==0)
		    {
		     System.out.println(num+" Is Divisiable by 4 and 11");
		    }
		   else
		    {
		     System.out.println(num+" Is Not divisiable by 4 and 11");
		    }
		    }
			 	
		    }
