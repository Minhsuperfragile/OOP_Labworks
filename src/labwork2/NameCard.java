package labwork2;

public class NameCard {
	private String name;
	private String phone;
	private String emailAddress;
	
	NameCard(String name, String phone, String emailAdress) {
		this.emailAddress = emailAdress;
		this.name = name;
		this.phone = phone;
	}
	
	public String getName() {
		return this.name;
	}
	public String getPhone() {
		return this.phone;
	}
	public String getEmailAddress() {
		return this.emailAddress;
	}
}
