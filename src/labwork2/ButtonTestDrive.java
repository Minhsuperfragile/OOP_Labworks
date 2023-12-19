package labwork2;

public class ButtonTestDrive {
	public static void main(String[] args) {
		Button myButton = new Button("Nuke Australia",255,255,255);
		
		myButton.setColor(83, 209, 153);
		System.out.println("Button has " + myButton.getColor() + " color");
		
		myButton.dePress();
		myButton.setLabel("Don't press this");
		myButton.unDepress();
	}
}
