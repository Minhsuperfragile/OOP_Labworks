package labwork1;

public class SumOfSines {
	public static void main(String[] args) {
		double t = Double.parseDouble(args[0]);
		double sum = Math.sin(2*t) + Math.sin(3*t);
		System.out.print(sum);
	}
}
