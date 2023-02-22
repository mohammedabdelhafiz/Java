package calculator;
import java.util.Scanner;
public class cal {
	public static void main (String args[]) {
		Scanner x = new Scanner(System.in); 
		double first,second,third,forth,answer,answer2;
		System.out.println("Enter First Num");
		first=x.nextDouble();
		
		System.out.println("Enter second Num");
		second=x.nextDouble();
		
		answer=first + second;
		System.out.println("answer is : " + answer);
		
		System.out.println("Enter third Num for Sub(-)");
		third=x.nextDouble();
		
		System.out.println("Enter forth Num for sub (-)");
		forth=x.nextDouble();
		
		answer2=third - forth;
		System.out.println("answer2 is : " + answer2);
		
		
	}
}
