package programs;

import java.util.Scanner;

public class FactorialDemo {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the value of i");
		int i=s.nextInt();
		
		int fact=1;
		for(;i>=1;i--){
			fact=fact*i;
		}
		
		System.out.println("Factorial of given number is:"+fact);
	}
}
