package labwork3;

public class Cylinder extends Circle {
	public double height;
	
	public Cylinder(Point center,double rad, double height) {
		super(center,rad);
		this.height = height;
		this.type = "cylinder";
	}
	
	@Override
	public double calArea() {
		double circleArea = 2 * Math.PI * this.radius * this.radius;
		double surroundArea = Math.PI * 2 * this.radius * this.height;
		return circleArea + surroundArea;
	}
	
	public double calVolume() {
		return Math.PI * this.radius * this.radius * this.height;
	}
}
