package programs;

public class FibonacciDemo {
	int a=1, b=2, c;//Instance variables
	static int n=1000;//Class variables
	
	public static void main(String[] args) {
		
		FibonacciDemo ob=new FibonacciDemo();
		
		System.out.print(ob.a+",");
		System.out.print(ob.b+",");
		ob.c=ob.a+ob.b;
		System.out.print(ob.c+",");
		
		
		while(ob.c<=FibonacciDemo.n){
			ob.a=ob.b;
			ob.b=ob.c;
			ob.c=ob.a+ob.b;
			if(ob.c<=ob.n){
				System.out.print(ob.c+",");
			}
		}
	}
}
