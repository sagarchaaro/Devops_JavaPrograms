package statements;

public class NestedLoopDemo {
	
	public static void main(String[] args) {
		for(int i=1;i<=10;i=i+4){//Outer loop
			
			System.out.println("Hello World... and i value is :"+i);//1,5,9
			
			for(int j=6;j>=1;j--){//Inner loop
				System.out.println("Nested loop Demo and j value is :"+j);//6,5,4,3,2,1
																		//6,5,4,3,2,1
																		
			}
		}
	}
}
