package lastYear;

import java.util.Scanner;

public class Bai1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("input your desired dimension: ");
		int dim = Integer.parseInt(scan.nextLine());
		
		System.out.println("Your first vector:");
		double[] vector1 = getVector(dim);
		System.out.println("Your second vector:");
		double[] vector2 = getVector(dim);
		
		double angle = Math.acos(dotProduct(vector1,vector2,dim)/(length(vector1,dim)*length(vector2,dim))) * 180/Math.PI;
		System.out.println("Angle between 2 vectors is: " + angle);
		
		scan.close();
	}
	
	private static double[] getVector(int dimension) {
		double[] newVector = new double[dimension];
		try (Scanner scan = new Scanner(System.in)) {
			for (int i=0; i<dimension; i++) {
				System.out.println("input your " + i + " elements: ");
				newVector[i] = Double.parseDouble(scan.nextLine());
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
		return newVector;
	}
	
	private static double dotProduct(double[] vector1, double[] vector2, int dimension) {
		double dot = 0;
		for (int i=0; i<dimension; i++) {
			dot = dot + vector1[i] + vector2[i];
		}		
		return dot;
	}
	
	private static double length(double[] vector, int dimension) {
		double length = 0;
		for (int i=0; i<dimension; i++) {
			length = length + vector[i]*vector[i];
		}
		return Math.sqrt(length);
	}
}