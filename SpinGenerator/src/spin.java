import java.util.Scanner;

public class spin extends SpinGen {

	public static void main(String[] args) {

			
		System.out.println("How many Spins you would like to do ? from 1 to 1000");
		
		Scanner scan = new Scanner(System.in);
		int spins = scan.nextInt();
		
		while (spins <1 || spins > 1000) {
			System.out.println("Out of Range, Please enter a number from 1 to 1000");
			spins = scan.nextInt();
		}
		
		generateSpins(spins);
		int wins = checkWins();
		System.out.println("YOU WON " + wins + " Times");
	}

}
