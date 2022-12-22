package javaproject;
import java.util.Scanner;
public class SumOfAllNaturalNumbers {

			public static void main(String[] args) {
				 int N, i, sum = 0;
				 System.out.println("Enter a number"); 
			        Scanner sc = new Scanner(System.in);
			       
			        N = sc.nextInt();
			        for(i =1; i <= N; i=i+2){
			           // if((i%2) == 1){
			              sum += i;
			          //  }
			        }
			        System.out.print("Sum of all odd numbers between 0 to "+ N + " = " + sum);
			    }


			}