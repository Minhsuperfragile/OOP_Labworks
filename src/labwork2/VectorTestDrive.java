package labwork2;

public class VectorTestDrive {
	public static void main(String[] args) {
		Vector v1 = new Vector(10,3);
		Vector v2 = new Vector(8,12);
		
		System.out.print("vector_1 has:\n");
		v1.printXY();
		System.out.print("vector_2 has:\n");
		v2.printXY();
		
		Vector v3 = v1.add(v2);
		System.out.print("vector_3 = vector_1 + vector_2 has:\n");
		v3.printXY();
		
		Vector v4 = v2.subtract(v1);
		System.out.print("vector_4 = vector_2 - vector_1 has:\n");
		v4.printXY();
		
		System.out.println("Dot product of vector_1 and vector_2 is "+v1.multiply(v2));
	}
}