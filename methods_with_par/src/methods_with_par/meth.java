package methods_with_par;
import java.util.Scanner;
public class meth {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		
		rtuna rtunaObject = new rtuna();
		System.out.println("enter:");
		
		String temp = input.nextLine();
		rtunaObject.setname(temp);
		rtunaObject.saying();
		
		

	}





}

