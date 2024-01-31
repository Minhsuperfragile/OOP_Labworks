package lastYear;

public abstract class Person {
	protected String name;
	protected String ID;
	
	public Person(String name, String ID) {
		this.name = name;
		this.ID = ID;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getID() {
		return this.ID;
	}
	
	public abstract void writeToFile();
}
