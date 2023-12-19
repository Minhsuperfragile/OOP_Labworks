package labwork1;

public class Kary {
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		int k = Integer.parseInt(args[1]);
		String output = "";

		while(n>0) {
			int remainder = n%k;
			switch (remainder) {
			case 0:
				output = "0" + output;
				break;
			case 1:
				output = "1" + output;
				break;
			case 2:
				output = "2" + output;
				break;
			case 3:
				output = "3" + output;
				break;
			case 4:
				output = "4" + output;
				break;
			case 5:
				output = "5" + output;
				break;
			case 6:
				output = "6" + output;
				break;
			case 7:
				output = "7" + output;
				break;
			case 8:
				output = "8" + output;
				break;
			case 9:
				output = "9" + output;
				break;
			case 10:
				output = "A" + output;
				break;
			case 11:
				output = "B" + output;
				break;
			case 12:
				output = "C" + output;
				break;
			case 13:
				output = "D" + output;
				break;
			case 14:
				output = "E" + output;
				break;
			case 15:
				output = "F" + output;
				break;
			}
			n = n/k;
		}
		System.out.println(args[0] + " in base " + k + " is: " + output);
	}
}
