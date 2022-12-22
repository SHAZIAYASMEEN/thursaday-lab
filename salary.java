package javaproject;
import java.util.Scanner;
public class salary {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		System.out.println("enter salary");
float salary,HRA,DA,gs;
Scanner sc=new Scanner(System.in);
salary=sc.nextFloat();
if(salary<1500)
{
	HRA=salary*10/100;
	DA=salary*70/100;}
	
	else {
		HRA=500;
		DA=salary*80/100;
	}
gs=salary+HRA+DA;
System.out.println("gross salary is:"+gs);
	}
	}


