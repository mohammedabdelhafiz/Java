package math_operators;
import java.util.Scanner;
public class op {
	public static void main(String args[]) {
		Scanner m = new Scanner(System.in);
		int girls , boys , people;
		girls = 60;
		boys = 200;
		people = boys / girls;
		System.out.println(people);
		
		int dogs , cats , animals;
		dogs = 200;
		cats = 60;
		animals = dogs % cats;
		System.out.println(animals);
	}
}
