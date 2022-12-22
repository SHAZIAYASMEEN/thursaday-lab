package javaproject;
import java.util.Scanner;
public class IfDemo {
public static void main(String[] args) 
{	
	float m1,m2,m3,m4,m5,total,avg;


	Scanner sc=new Scanner(System.in);

	System.out.println("Enter value is five subjects");

	m1=sc.nextFloat();
	m2=sc.nextFloat();
	m3=sc.nextFloat();
	m4=sc.nextFloat();
	m5=sc.nextFloat();
	total=m1+m2+m3+m4+m5;
	avg=total/5;
	System.out.println("total: " +total);
	//250 passing mark
	if(total>=250) //250>=250
	System.out.println("pass");
	else
	System.out.println("fail");
		
	}
	}

