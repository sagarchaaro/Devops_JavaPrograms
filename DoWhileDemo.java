package statements;

public class DoWhileDemo {
	public static void main(String[] args) {
		int i=1;
		do{
			System.out.println("Hello world and i value is :"+i);
			i++;
		}while(i<=10);
	}
}

class DoWhileDemo1{
	public static void main(String[] args) {
		int i=5;
		do{
			int a=1, b=2;
			int c=a+b;
			System.out.println("Addition of the numbers is:"+c);
			i++;
		}while(i<=2);
	}
}

class DoWhileDemo2 {
	public static void main(String args[]){
		
		int i=1;
		System.out.println("Before Do While Loop");
		do{
			System.out.println(i);
			i++;
		}while(i<=10);
		
		System.out.println("After Do While Loop");
	}
}
