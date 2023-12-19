package labwork1;

public class CombineBinaryInString {
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		String output = "";

		while(n>0) {
			int remainder = n%2;
			switch (remainder) {
			case 0:
				output = "0" + output;
				break;
			case 1:
				output = "1" + output;
				break;
			}
			n=n/2;
		}
		
		System.out.println(args[0] + " in binary is " + output);
	}
}
