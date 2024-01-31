package lastYear;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Course {
	private String ID;
	private String name;
	
	public Course(String name, String id) {
		this.name = name;
		this.ID = id;
	}
	
	public void writeToFile() {
		try {
			PrintWriter fw = new PrintWriter(new FileWriter("Course.txt",true));
			fw.write(this.ID + "@" + this.name + "\n");
			System.out.println("successfully wrote to a file");
			fw.close();
		} catch (IOException e) {
			System.out.println("An error occurred.");
		    e.printStackTrace();
		}
	}
	
	public static int readFromFile(String path, Course[] courseList) {
		try {
			BufferedReader reader = new BufferedReader(new FileReader(path));
			String line;
			int courseIndex = 0;
			while ((line = reader.readLine()) != null) {
				String[] courseData = line.split("@",5);
				courseList[courseIndex] = new Course(courseData[1],courseData[0]);
				courseIndex++;
			}
			reader.close();
		} catch (IOException e) {
			System.out.println("An error has occured");
			e.printStackTrace();
			return -1;
		}
		return 0;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getID() {
		return this.ID;
	}
	
	public void printOut() {
		System.out.println(this.name + " " + this.ID);
	}
}
