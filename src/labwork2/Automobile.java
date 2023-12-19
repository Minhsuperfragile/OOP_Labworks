package labwork2;

public class Automobile {
	public static void main(String[] args) {
		init(4.5,34,"29JAD");
		accelerate(4);
		decelerate(5);
	}
	
	static double fuel;
	static double speed;
	static String license;
	
	static void init(double f, double s, String l) {
		fuel = f;
		speed = s;
		license = l;
	}
	static void accelerate(double v) {
		if (fuel > 0) speed += v;
	}
	static void decelerate(double v) {
		if (fuel <= 0) speed -= v;
	}
}