package labwork2;

public class NameCardTestDrive {
	
	public static void main(String[] args) {
		
		NameCard johnNameCard = new NameCard("John Patric","0386860215","johnpat@yahoo.com");
	
		System.out.println(johnNameCard.getName());
		System.out.println(johnNameCard.getPhone());
		System.out.println(johnNameCard.getEmailAddress());
	}
	
}
