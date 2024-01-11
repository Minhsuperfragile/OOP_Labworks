package labwork3;

public class Point extends Shape{
	public double X;
	public double Y;
	
	public Point(double x, double y){
		this.X = x;
		this.Y = y;
		this.type = "point";
	}
	
	@Override
	public String getName() {
		return this.type;
	}
}
