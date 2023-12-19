package labwork2;

public class Vector {
	private int x,y;
	
	Vector(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public void printXY() {
		System.out.println("X = " + this.x);
		System.out.println("Y = " + this.y);
	}
	
	public Vector add(Vector other) {
		Vector additon = new Vector(this.x + other.x,this.y + other.y);
		return additon;
	}
	public Vector subtract(Vector other) {
		Vector subtraction = new Vector(this.x - other.x,this.y - other.y);
		return subtraction;
	}
	public int multiply(Vector other) {
		return (this.x*other.x + this.y*other.y);
	}
}
