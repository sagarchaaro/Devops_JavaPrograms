package programs;

import java.util.Scanner;

public class StrongDemo {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=s.nextInt();
		
		int temp=n;
		int sum=0, r;
		while(n!=0){//outer loop
			
			int fact=1;
			r=n%10;
			
			for(;r>=1;r--){//Inner loop
				fact=fact*r;
			}
			
			sum=sum+fact;
			n=n/10;
			
		}
		
		if(sum==temp){
			System.out.println("Given number is a strong number :"+temp);
		}else{
			System.out.println("Given number is not a strong number :"+temp);
		}
	}
}
