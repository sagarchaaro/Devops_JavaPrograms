package programs;

import java.util.Scanner;

public class PrimeDemo {
		
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		
		System.out.println("Enter the value of i");
		int i=s.nextInt();
		
		int count=0, j=1;
		while(j<=i){
			if(i%j==0){
				count++;
			}
			j++;
		}
		
		if(count==2){
			System.out.println("Given number is prime "+i+" and divisible by "+count+ " times");
		}else{
			System.out.println("Given number is not prime "+i+" and divisible by "+count+ " times");
		}
	}

}

class PrimeDemo1 {
	
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		
		System.out.println("Enter the value of i");
		int i=s.nextInt();
		
		int count=0, j=2;
		do{
			if(i%j==0){
				count++;
			}
			j++;
		}while(j<i);
		
		if(count==0){
			System.out.println("Given number is prime "+i+" and divisible by "+count+ " times");
		}else{
			System.out.println("Given number is not prime "+i+" and divisible by "+count+ " times");
		}
	}

}
