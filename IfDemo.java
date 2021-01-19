package statements;

public class IfDemo {
	
	public static void main(String args[]){
		System.out.println("Hello World..!!!");
		
		int x=24;
		if(x<=25){//true
			System.out.println("I am in the If condition and x value is :"+x);
		}
		
		System.out.println("This is a Java Statements programs");
		x=100;
		if(x>='a'){
			System.out.println("X value is greater than character a:"+x);
		}
		
		System.out.println("Java EE");
		
		int m=50, n=90;
		boolean b1=(m<=n);
		
		if(b1){
			int a=90, b=80;
			int c=a+b;
			int d=a*b;
			System.out.println("Addition of the numbers :"+c);
			System.out.println("Multiplication of the numbers :"+d);
		}
		
	}
	
}

class IfDemo1 {
	public static void main(String[] args) {
		int x=90, y=45, z=55;
		
		boolean a=x>y;//trye
		boolean b=y<z;//true
		
		if(b){
			System.out.println("x is smaller than y");
		}
		
		if(a){
			System.out.println("This is If Demo1 program");
		}
	}
}

class IfDemo2 {
	public static void main(String[] args) {
		int x=90,y=45,z=65;
		
		if((x>y) || (x==y)){//true ||false--> true
			x=78;
			System.out.println("I am in the if condition");
			System.out.println("x value is: "+x);
			System.out.println("y value is: "+y);
			System.out.println("z value is: "+z);
			y=99;
			z=100;
		}
		
		System.out.println("After If Statement, x value is :"+x+" y value is "+y+" z value is"+z);
	}
}

