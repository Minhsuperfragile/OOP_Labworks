package labwork3;

public abstract class Shape extends Object {
	public Shape() {
		super("shape");
	}
	
	public double calArea() {
		return 0;
	}
	
	public double calVolume() {
		return 0;
	}
	
	public abstract String getName();
}
