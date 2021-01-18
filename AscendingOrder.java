package programs;

import java.util.Scanner;

public class AscendingOrder {
	public static void main(String args[]){
		int a, b, c;
		Scanner ob= new Scanner(System.in);
		
		System.out.println("Enter the value of a ");
		a=ob.nextInt();
		
		System.out.println("Enter the value of b ");
		b=ob.nextInt();
		
		System.out.println("Enter the value of c ");
		c=ob.nextInt();
		
		if(a<b && a<c){
			System.out.println("a:"+a);
			if(b<c){
				System.out.println("b:"+b);
				System.out.println("c:"+c);
			}else{
				System.out.println("c:"+c);
				System.out.println("b:"+b);
			}
		}else if(b<a && b<c){
			System.out.println("b:"+b);
			if(a<c){
				System.out.println("a:"+a);
				System.out.println("c:"+c);
			}else{
				System.out.println("c:"+c);
				System.out.println("a:"+a);
			}
		}else if(c<a && c<b){
			System.out.println("c:"+c);
			if(a<b){
				System.out.println("a:"+a);
				System.out.println("b:"+b);
			}else{
				System.out.println("b:"+b);
				System.out.println("a:"+a);
			}
		}else{
			System.out.println("Given data is incorrect");
		}
		
		
		
	}
}
