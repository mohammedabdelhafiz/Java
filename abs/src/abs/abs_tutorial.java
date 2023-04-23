package abs;

import abs.Dog.chiwawa;

abstract class Dog{
	
	String breed;
	
	public void bark() {
		System.out.println("Barkkk");
	}
	
}
	
class Chiwawa extends Dog{
	
}


public class abs_tutorial {

	public static void main(String[] args) {
	
		Chiwawa chiwawa = new Chiwawa();
		
		chiwawa.bark();
		
		
		
	}

}

