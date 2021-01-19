package statements;

public class IfElseDemo {
	public static void main(String[] args) {
		char ch='c', ch1='C';
		int a=100;
		System.out.println("This is before Ifelse demo");
		if(ch==ch1){
			System.out.println("both character and integer values are same");
		}else{
			System.out.println("both character and integer values are not same");
		}
		System.out.println("This is after Ifelse demo");
	}
}

class IfElseDemo1{
	public static void main(String[] args) {
		int a=99, b=500, c=74;
		if((b>=a && c!=a) && (b==100)){//(true && true)--> true && false --> false
			a=10;
			c=a+b;
			System.out.println("Value of a is :"+a+" value of b is :"+b+" value of c is :"+c);
		}else{
			b=25;
			int d=c*b;
			System.out.println("Value of a is :"+a+" value of b is :"+b+" value of c is :"+c);
		}
	}
}
