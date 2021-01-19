package statements;

public class ContinueDemo {
	public static void main(String[] args) {
		for(int i=1;i<=10;i++){
			
			if(i==5){
				continue;
			}
			System.out.println(i);//1,2,3,4,6,7,8,9,10
			
		}
	}
}

class ContinueDemo1 {
	public static void main(String[] args) {
		
		for(int i=1;i<=3;i++){//Outer Loop
			
			for(int j=1;j<=5;j++){//Inner Loop
				
				if(j==3){
					continue;
				}
				System.out.println(j);//1,2,4,5 
									//1,2,4,5
									//1,2,4,5
									
			}
			
		}
		
	}
}

class ContinueLabelDemo {
	public static void main(String[] args) {
		test1:for(int i=1;i<=3;i++){//Outer loop
			
				test2:for(int j=1;j<=10;j++){//Inner loop
					
						if(j>5){
							
							continue test1;
						}
						System.out.println(j);//1,2,3,4,5
											//1,2,3,4,5
											//1,2,3,4,5
					
					  }
			
			  }
	}
}
