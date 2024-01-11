package labwork3;

public interface ShapeInterface extends ObjectInterface{
	public double calArea();
	public double calVolume();
	public String getName();
}

class PointItf implements ShapeInterface {
	private double X;
	private double Y;
	protected String name;
	
	public PointItf(double x, double y) {
		this.X = x;
		this.Y = y;
		this.name = "Point";
	}
	
	@Override
	public double calArea() {
		return 0;
	}
	
	public double calVolume() {
		return 0;
	}
	
	public double getX() {
		return this.X;
	}
	
	public double getY() {
		return this.Y;
	}
	
	public String getName() {
		return this.name;
	}
}

class CircleItf extends PointItf {
	protected double radius;
	
	public CircleItf(PointItf center, double r) {
		super(center.getX(),center.getY());
		this.radius = r;
		this.name = "Circle";
	}
	
	@Override
	public double calArea() {
		return Math.PI * this.radius * this.radius;
	}
}

class CylinderItf extends CircleItf {
	private double height;
	
	public CylinderItf(PointItf center, double r, double h) {
		super(center,r);
		this.height = h;
		this.name = "Cylinder";
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

class Main {
	public static void main(String[] args) {
		PointItf centerPoint = new PointItf(10,10);
		CircleItf circle = new CircleItf(centerPoint,6);
		CylinderItf cyl = new CylinderItf(centerPoint,4,5);
		
		PointItf[] array = {centerPoint,circle,cyl};
		
		for (PointItf shape : array) {
			double area = shape.calArea();
			double vol = shape.calVolume();
			String nom = shape.getName();
			System.out.println(nom + " has area of " + area + " units and volume of " + vol + " units");
		}
	}
}