package statements;

public class ForDemo {
	public static void main(String[] args) {
		for(int i=1;i<=15;i++){
			System.out.println("Hello World...and i value is :"+i);
		}
	}
}


class ForDemo1 {
	public static void main(String args[]){
		int n;
		for(n=56;n<=75;n=n+8){
			System.out.println(n);//56,64,72
			System.out.println("Core Java");//1,2,3
		}
		System.out.println("This is the forloop demo and n value is :"+n);
	}
}

class ForDemo2 {
	public static void main(String[] args) {
		
		for(int i=20;i>=8;i=i-5){
			System.out.println(i);//20,15,10
		}
		
		int i=0;
		
		for(i=1;i<=20;i=i+3){
			
			if(i<=5){
				i=i+10;
				System.out.println("Core Java and i value is :"+i);//11
			}else{
				System.out.println("Advanced Java and i value is :"+i);//14,17,20
			}
		}
		
		System.out.println("Final value of i is :"+i);//23
	}
}

class ForDemo3 {
	public static void main(String[] args) {
		
		System.out.println("Before For loop");
		
		for(int i=20;i<=35;i=i+3){
			System.out.println("value of i is :"+i);//20,24,28,32
			i++;
		}
		
		System.out.println("After For Loop");
		
	}
}
