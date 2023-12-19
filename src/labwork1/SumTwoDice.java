package labwork1;
import java.util.Random;

public class SumTwoDice {
	public static void main (String[] args) {
		Random rand = new Random();
		
		int upperbound = 6;
		
		int dice1 = rand.nextInt(upperbound)+1;
		int dice2 = rand.nextInt(upperbound)+1;
		
		System.out.println(dice1 + dice2);
	}
}
