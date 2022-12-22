package javaproject;
import java.util.Scanner;
public class ProductOfAllNaturalNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method st
	 int product = 1, limit;
				Scanner sc = new Scanner(System.in);
				System.out.println("Calculates Product of first n numbers");
				System.out.println("-------------------------------------");
				System.out.print("Enter limit number:");
				limit = sc.nextInt();
				for(int i=1;i<=limit;i++) {
					product *= i;
				}
				System.out.println("Product of first '"+limit+"' numbers: " + product);
			}
		}