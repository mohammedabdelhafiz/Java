package object_oriented;

public class Main {

	public static void main(String[] args) {
		Headphones h = new Headphones();
		
				
		System.out.println(h.charge);
		System.out.println(h.color);
		System.out.println(h.power);
		
	
		
		h.power_on();
		
		System.out.println(h.power);
		
	}

}
