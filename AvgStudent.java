package programs;

import java.util.Scanner;

public class AvgStudent {
	public static void main(String[] args) {
		Scanner ob= new Scanner(System.in);
		
		
		float s1, s2, s3, s4;
		System.out.println("Enter the value of s1");
		s1=ob.nextInt();
		
		System.out.println("Enter the value of s2");
		s2=ob.nextInt();
		
		System.out.println("Enter the value of s3");
		s3=ob.nextInt();
		
		System.out.println("Enter the value of s4");
		s4=ob.nextInt();
		
		System.out.println("Student Marks are, s1:"+s1+" s2:"+s2+" s3:"+s3+" s4:"+s4);
		
		float avg=(s1+s2+s3+s4)/4;
		System.out.println("Average of the marks is :"+avg);
	}
}
