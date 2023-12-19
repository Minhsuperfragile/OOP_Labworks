package labwork2;

public class ShoppingCardTestDrive {
	public static void main(String[] args) {
		ShoppingCart mySC = new ShoppingCart();
		
		mySC.addToCart("Bread");
		mySC.addToCart("Bunny");
		mySC.addToCart("Cream");
		mySC.addToCart("Pie");
		mySC.addToCart("Hard Disk");
		
		mySC.removeFromCart("Bread");
		
		mySC.checkOut();
	}
}