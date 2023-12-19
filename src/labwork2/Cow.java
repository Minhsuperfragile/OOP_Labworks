package labwork2;

public class Cow {
	private String name;
	private int age;
	private String breed;
	
	Cow(String name, String breed, int age){
		this.name = name;
		this.breed = breed;
		this.age = age;
	}
	
	public void moo() {
		System.out.println("Moo...!");
	}
	
	public void setAge(int age) {
		this.age = age;
		System.out.println(this.name + " is " + this.age + " years old!");
	}
}