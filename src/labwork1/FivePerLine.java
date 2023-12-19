package labwork1;

public class FivePerLine {
	public static void main(String[] args) {
		for (int i=1000;i<2001;i++) {
			System.out.print(i);
			System.out.print(" ");
			if((i+1)%5 == 0) {System.out.print("\n");}
		}
	}
}