package statements;

import java.util.Scanner;
//import java.lang.*;---> Implicitly available in every program

import java.util.*;

public class IfElseIfDemo {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		
		int x=87, y=66;
		int a=4, b;
		
		
		if(x==y){
			System.out.println("Both X and Y values are same");
		}else if(x>y && x<=y){//true && false -->false
			System.out.println("Java EE");
			b=a*a*a;
			System.out.println("Cube of the given number a is :"+b);
		}else if(x==y || x<=y){//false || false --> false
			System.out.println("Java ME");
			int m,n;
			System.out.println("Enter the values of m and n");
			m=s.nextInt();
			n=s.nextInt();
			System.out.println("Addition of the given numbers is :"+ (m+n));
		}else if(x<='a' && x>='a'){//true && false --> false
			System.out.println("Core Java");
		}else{
			System.out.println("Advanced Java");
			x+=y;//x=x+y=153
			y+=x;//y=y+x=66+153=219
			System.out.println("Values of x "+x+"and y are "+y);
		}
	}
}
class IfElseIfDemo1 {
	public static void main(String[] args) {
		int a=40, b=8, c=250;
		
		if(a>b && a>c){//true && false --> false
			System.out.println("a value is greater than b,c");
		}else if(b>a && b>c){//false && false --> false
			System.out.println("b value is greater than a,c");
		}else if(c>a && c>b){//true && true
			System.out.println("c value is greater than a,b");
		}else{
			System.out.println("None of the above statements is true...!!!");
		}
	}
}
