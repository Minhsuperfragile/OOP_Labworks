package labwork3;

public class ShapeTestDrive {
	public static void main(String[] args) {
		Point centerPoint  = new Point(10,10);
		Circle circle = new Circle(centerPoint,5);
		Cylinder cyl = new Cylinder(centerPoint,3,7);
		
		Shape[] entities = {centerPoint,circle,cyl};
		
		for(Shape x : entities) {
			String name = x.getName();
			double area = x.calArea();
			double volume = x.calVolume();
			System.out.println(name + " has area of " + area + " units and volume of " + volume + "units");
		}
	}

}
