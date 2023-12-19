package labwork2;

public class ShoppingCart {
	private String[] items = new String[10];
	private int itemCount = 0; 
	
	ShoppingCart(){
		
	}
	public void addToCart(String item) {
		if (this.itemCount >= 10) {
			System.out.print("Your cart is full\n");
			return;
		}
		System.out.println("Added " + item + " to cart!");
		this.items[this.itemCount] = item;
		this.itemCount++;
	}
	
	public void removeFromCart(String item) {
		for (int i=0; i<this.itemCount; i++) {
			if (item.equals(this.items[i])) {
				for (int j=i;j<9;j++) {
					this.items[j] = this.items[j+1];
				}
				System.out.println("Removed " + item + " from your cart!");
				this.itemCount--;
				return;
			}
		}
		System.out.println("There is no " + item + " in your cart!");
	}
	
	public void checkOut() {
		if (this.itemCount == 0) {
			System.out.print("There is nothing in your cart!");
			return;
		}
		for (int i=0; i<this.itemCount; i++) {
			System.out.println("Purchased "+this.items[i]);
		}
	}
}
