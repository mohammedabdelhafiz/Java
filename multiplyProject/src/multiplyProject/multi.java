package multiplyProject;

import java.util.Scanner;

public class multi {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 2 numbers");
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		System.out.println(multi(a, b));

	}
		public static int multi(int a , int b ) {
			return a*b;
		}
}
