package lastYear;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Lecturer extends Person{
	Course course;
	
	public Lecturer(String name, String ID, Course course) {
		super(name,ID);
		this.course = course;
	}
	
	public void writeToFile() {
		try {
			PrintWriter writer = new PrintWriter(new FileWriter("Lecturer.txt",true));
			writer.write(this.ID + "@" + this.name + "@" + this.course.getID() + "\n");
			System.out.println("successfully wrote to a file");
			writer.close();
		} catch (IOException e) {
			System.out.println("An error occurred.");
		    e.printStackTrace();
		}
	}
	
	public static int readFromFile(String path, Course[] courseList, Lecturer[] lecturerList) {
		try {
			BufferedReader reader = new BufferedReader(new FileReader(path));
			String line;
			int lecturerIndex = 0;
			while ((line = reader.readLine()) != null) {
				String[] lecturerData = line.split("@",3);
				for (int i=0; i<courseList.length; i++) {
					if (lecturerData[2].equals(courseList[i].getID())) {
						lecturerList[lecturerIndex] = new Lecturer(lecturerData[1],lecturerData[0],courseList[i]);
						break;
					}
				}
				lecturerIndex++;
			}
			reader.close();
		} catch (IOException e) {
			System.out.println("An error has occured");
			e.printStackTrace();
			return -1;
		}
		return 0;
	}
	
	public void printOut() {
		System.out.println(this.name + " teaches " + this.course.getID());
	}
}
