package programs;

import java.util.Scanner;

public class ArmStrongDemo {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		
		System.out.println("Enter the value of n");
		int n=s.nextInt();
		int temp=n;
		
		int sum=0, r;
		
		
		if(sum==temp){
			System.out.println("Given number is Armstrong number "+temp);
		}else{
			System.out.println("Given number is not a Armstrong number "+temp);
		}
		
	}
}
