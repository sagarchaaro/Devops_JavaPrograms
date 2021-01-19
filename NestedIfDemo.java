package statements;

public class NestedIfDemo {
	public static void main(String[] args) {
		int n=84;
		if(n%2==0){//Upper If Condition//true
			System.out.println("EvenNumber");
			if(n>=80){//Inner If Condition//true
				System.out.println("Distinction");
				n=-25;
				if(n>=0){//Inner-Inner If condition//false
					System.out.println("PositiveNumber");
				}else{
					System.out.println("NegativeNumber");
				}
			}else if(n>=50 && n<70){//Inner If condition
				System.out.println("FirstClass");
			}else{//Inner If condition
				System.out.println("Fail");
			}
			
		}else{//Outer If condition
			System.out.println("OddNumber");
			if(n==70){//Inner If condition
				System.out.println("Core Java");
			}else if(n==60){//Inner If condition
				System.out.println("Advanced Java");
			}else{//Inner If condition
				System.out.println("Java programming");
			}
		}
	}
}
