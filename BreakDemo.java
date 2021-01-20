package statements;

public class BreakDemo {
	
	public static void main(String[] args) {
		
		System.out.println("Before Break Execution");
		for(int i=1;i<=10;i++){
			
			if(i==5){
				break;
			}
			
			System.out.println("i Value is :"+i);
		}
		
		System.out.println("Break Execution");
	}
}

class BreakDemo1 {
	public static void main(String[] args) {
		for(int i=1;i<=3;i++){
			
			for(int j=1;j<=10;j++){
				
				if(j==4){
					break;
				}
				System.out.println(j);											
										
			}			
		}
	}
}

class BreakLabelDemo {
	public static void main(String[] args) {
		abc:for(int i=1;i<=3;i++){//Outer loop
				
				mno:for(int j=1;j<=10;j++){//Inner loop
					
						if(j==5){
							break abc;
						}
						System.out.println(j);//1,2,3,4
					
					}
			
			}
	}
}
