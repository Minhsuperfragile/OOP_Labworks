package labwork2;

public class Button {
	private String label;
	private int[] color = new int[3];
	
	Button(String label, int red,int green, int blue) {
		this.label = label;
		this.color[0] = red;
		this.color[1] = green;
		this.color[2] = blue;
	}
	
	private String convertToHex(int n) {
		String output = "";
		while(n>0) {
			int remainder = n%16;
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
			n = n/16;
		}
		return output;
	}
	
	public String getColor() {
		return ("#"+convertToHex(this.color[0])+convertToHex(this.color[1])+convertToHex(this.color[2]));
	}
	
	public void setColor(int red, int green, int blue) {
		this.color[0] = red;
		this.color[1] = green;
		this.color[2] = blue;
	}
	
	public void setLabel(String newLabel) {
		this.label = newLabel;
	}
	
	public void dePress() {
		System.out.println("Pressed The " + this.label + " Button");
	}
	
	public void unDepress() {
		System.out.println("Released The " + this.label + " Button");
	}
}
