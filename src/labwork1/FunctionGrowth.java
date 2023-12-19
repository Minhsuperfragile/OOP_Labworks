package labwork1;

public class FunctionGrowth {
	public static void main(String[] args) {
		int N = Integer.parseInt(args[0]);
		double lnN = Math.log(N);
		double NlnN = N*lnN;
		double N2 = N*N;
		double N3 = N2*N;
		
		System.out.println("n\tln n\t\t\tn ln n\t\t\tn^2\tn^3");
		System.out.println(N + "\t" + lnN + "\t" + NlnN + "\t" + N2 + "\t" + N3 );
		
	}
}
