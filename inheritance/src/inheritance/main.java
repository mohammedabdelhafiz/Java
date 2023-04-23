package inheritance;

public class main {

	public static void main(String[] args) {
		Mouse1 m1 = new Mouse1();
		
		m1.leftclick();
		m1.rightclick();
		m1.scroll_down();
		m1.scroll_up();
		
		
		
		Mouse2 m2 = new Mouse2();
		
		m2.leftclick();
		m2.rightclick();
		m2.scroll_down();
		m2.scroll_up();
	}

}
