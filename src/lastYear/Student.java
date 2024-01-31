package lastYear;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

public class Student extends Person {
	Course[] courseEnrolled;
	double[] midtermMarks;
	double[] finalMarks;
	
	public Student(String name, String ID,Course[] courseList) {
		super(name,ID);
		this.courseEnrolled = courseList;
		this.midtermMarks = new double[courseList.length];
		this.finalMarks = new double[courseList.length];
		randomMark();
	}
	
	public Student(String name, String ID,Course[] courseList, double[] midList, double[] finalList) {
		super(name,ID);
		this.courseEnrolled = courseList;
		this.midtermMarks = midList;
		this.finalMarks = finalList;
	}
	
	private void randomMark() {
		Random rand = new Random();
		
		for (int i=0; i<this.courseEnrolled.length;i++) {
			this.midtermMarks[i] = Math.round(rand.nextDouble() * 20 * 100.0)/100.0;
			this.finalMarks[i] = Math.round(rand.nextDouble() * 20 * 100.0)/100.0;
		}
	}
	
	public void writeToFile() {
		try {
			PrintWriter fw = new PrintWriter(new FileWriter("Students.txt",true));
			fw.write(this.ID + "@" + this.name + "\n");
			for (int i=0; i<this.courseEnrolled.length;i++) {
				fw.write("\t" + this.courseEnrolled[i].getID() + "@" + this.midtermMarks[i] + "@" + this.finalMarks[i] + "\n");
			}
			System.out.println("successfully wrote to a file");
			fw.write("END@\n");
			fw.close();
		} catch (IOException e) {
			System.out.println("An error occurred.");
		    e.printStackTrace();
		}
	}
	
	public static int readFromFile(String path, Student[] studentList, Course[] courseList) {
		try {
			BufferedReader reader = new BufferedReader(new FileReader(path));
			String line;
			int studentIndex = 0, courseCount = courseList.length;
			
			String name = "", id = "";
			double[] midMark = new double[courseCount];
			double[] finMark = new double[courseCount];
			
			while ((line = reader.readLine()) != null) {
				String[] lineData = line.split("@",5);
				if (lineData[0].charAt(0) != '\t') {
					if (lineData[0].equals("END")) {
						studentList[studentIndex] = new Student(name,id,courseList,midMark.clone(),finMark.clone());
						studentIndex++;
						continue;
					}		
					courseCount = 0;
					name = lineData[1];
					id = lineData[0];
				} else {
					midMark[courseCount] = Double.parseDouble(lineData[1]);
					finMark[courseCount] = Double.parseDouble(lineData[2]);
					courseCount++;
				}
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
		System.out.println(this.name + " " + this.ID + ":");
		for (int i=0;i<this.courseEnrolled.length;i++) {
			System.out.println(this.courseEnrolled[i].getName() + ": " + this.midtermMarks[i] + " " + this.finalMarks[i]);
		}
	}
	
	public int isPassed() {
		double avgMid = 0, avgFinal = 0;
		for (int i=0; i<this.midtermMarks.length; i++) {
			avgMid = avgMid + this.midtermMarks[i];
			avgFinal = avgFinal + this.finalMarks[i];
		}
		avgMid = Math.round(avgMid/this.midtermMarks.length*100.0)/100.0;
		avgFinal = Math.round(avgFinal/this.finalMarks.length*100.0)/100.0;
		if (avgMid > 7 && avgFinal > 10) {
			System.out.println("Passed - " + avgMid + " " + avgFinal);
			return 1;
		} else {
			System.out.println("Failed - " + avgMid + " " + avgFinal);
			return 0;
		}
	}
}