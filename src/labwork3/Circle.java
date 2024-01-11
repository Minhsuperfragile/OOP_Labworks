package labwork3;

public class Circle extends Point {
	public double radius;
	protected Point centerPoint;
	
	public Circle(Point center, double radius) {
		super(center.X, center.Y);
		this.type = "circle";
		this.radius = radius;
		this.centerPoint = center;
	}

	@Override
	public double calArea() {
		return Math.PI * this.radius * this.radius;
	}
}
