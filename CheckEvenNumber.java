package javaproject;
import java.util.Scanner;
public class CheckEvenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println(" enter  number to check even or not");
num=sc.nextInt();//12
//if (num%2!=1)//12%2 0!=1   if (num%2!==0)
//System.out.println(  num+ "is odd  number ");
//else
//System.out.println( num+ "is even number ");
 if(num %2==1)//if(num%2!=0)
	 System.out.println(  num+ "is odd number ");
else
System.out.println( num+ "is even number "); 
	


	}

}
