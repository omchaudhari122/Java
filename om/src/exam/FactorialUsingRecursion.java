package exam;

import java.util.Scanner;

public class FactorialUsingRecursion {
	
	public static void main(String[]args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter The Numbers");
		
		int number= scanner.nextInt();
		int factorial = fact(number);
		
		 System.out.println("Factorial of entered number is :"+factorial);
	 }
	   static int fact(int n)
	   {
	       int output;
	       if(n==1){
	         return 1;
	       }
	       output = fact(n-1)* n;
	       return output;
	   }
		
				
	}
	
