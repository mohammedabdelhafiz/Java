package object_oriented;

public class Headphones {
	String charge = "USB-C";
	String [] controls = { "Power" , "Volume" , "Skip" , "Play/Pause" };
	String color = "RED";
	
	static boolean power = false;
	static int volume = 100;
	
	public static void power_on() {
		power = true;
	}
	
	
	public static void power_off() {
		power = false;
	}
	
	public static void volume_up() {
		volume++;
	}
	
	public static void volume_down() {
		volume--;
	}
	
}
