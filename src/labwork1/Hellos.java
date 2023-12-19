package labwork1;

public class Hellos {
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		String ligma;
		for (int i=0;i<n;i++) {
			int lol = i%10;
		switch (lol) {
		case 1:
			if (i == 11) {ligma = "th";break;}
			ligma = "st";
			break;
		case 2:
			if (i == 12) {ligma = "th";break;}
			ligma = "nd";
			break;
		case 3:
			if (i == 13) {ligma = "th";break;}
			ligma = "rd";
			break;
		default:
			ligma = "th";
		}
		System.out.print(i);
		System.out.print(ligma);
		System.out.println(" Hello");
		}
	}
}