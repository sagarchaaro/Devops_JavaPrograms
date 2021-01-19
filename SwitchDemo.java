package statements;

public class SwitchDemo {
	public static void main(String[] args) {
		char ch='b';
		
		switch(ch){
			case 'a':
					int a=10, b=20;
					int c=a+b;
					System.out.println("Addition of two values "+c);
					//break;
			case 'b':
					int x=5, y=9;
					int z=x*y;
					System.out.println("Multiplication of two values "+z);
					//break;
			case 'c': 
					int m=6;
					int n=m* m*m;
					System.out.println("Cube of the given number is :"+n);
					break;
			case 'd':
					int j=99, k=88;
					int l=j-k;
					System.out.println("Subtraction of the given numbers is :"+l);
					break;
			
			default:
					System.out.println("Invalid number is provided");
					break;
		}
	}
}
