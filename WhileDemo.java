package statements;

public class WhileDemo {
	public static void main(String[] args) {
		int i=1;//Initialization
		while(i<=10){//condition
			System.out.println("Hello World...!!! and this is a while loop");//4
			i=i+3;//Increment/decrement
			//i=1+3-->4+3=7+3=10+3=13
		}
		
	}
}

class whileDemo1{
	
	public static void main(String[] args) {
		int i=1;
		while(i<=8){
			System.out.println(i);
			//i++;
		}
	}
	
	
}

class WhileDemo2 {
	public static void main(String[] args) {
		int x=25;//Initializaton
		while(x<=5){
			x=20;
			System.out.println("Hello");
			System.out.println("Core Java");
			x++;
		}
		System.out.println("Value of x is :"+x);
		
	}
}
class WhileDemo3 {
	public static void main(String[] args) {
		int n=456;
		boolean b=(n>=100);
		while(b){
			n=n/10;
			System.out.println(n);
			b=false;
		}
		System.out.println("This is While Loop Demo");
	}
}
class WhileDemo4{
	public static void main(String[] args) {
		int i=5;
		while(i<=2){
			int a=1, b=2;
			int c=a+b;
			System.out.println("Addition of the numbers is:"+c);
			i++;
		}
	}
}
