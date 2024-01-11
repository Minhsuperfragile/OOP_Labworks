package labwork3;
import java.util.Scanner;  // Import the Scanner class
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;  // Import the IOException class to handle errors


public class EmployeeTestDrive {
	static int processData(String data, String target) {
		int startIndex = data.indexOf(target) + target.length() + 1;
		int endIndex = data.length();
		
		String subStr = data.substring(startIndex, endIndex);
		endIndex = subStr.indexOf(" ");
		
		if (endIndex < 1) {
			return Integer.parseInt(subStr);
		}
		subStr = subStr.substring(0,endIndex);
		return Integer.parseInt(subStr);
	}
	
	public static void main(String[] args) {
		File file = new File("src\\labwork3\\Employee.txt");
		Scanner scan = new Scanner(System.in);
		Scanner scanFile = null;
		FileWriter myWriter = null;
		
		System.out.println("Enter number of employee: ");
		int numberOfEmployee = Integer.parseInt(scan.nextLine());

		Employee[] eArray = new Employee[numberOfEmployee];
		
		for (int i=0; i<numberOfEmployee; i++) {
			System.out.println("Employee number " + (i+1));
			System.out.println("Name: ");
			String name = scan.nextLine();
			System.out.println("ID: ");
			String id = scan.nextLine();
			System.out.println("Department: ");
			String dept = scan.nextLine();
			System.out.println("Basic Salary: ");
			int bs = Integer.parseInt(scan.nextLine());
			System.out.println("Extra Salary: ");
			int es = Integer.parseInt(scan.nextLine());
			eArray[i] = new Employee(id,name,dept,bs,es);
			
		}
		
		try {
			myWriter = new FileWriter(file);  
			
			for (int i=0; i<numberOfEmployee; i++) {
				String data = "ID: " + eArray[i].getEmployeeID() + " Name: " + eArray[i].getEmployeeName() +
						" Dept: " + eArray[i].getEmployeeDept() + " Basic Salary: " + eArray[i].getBasicSalary() +
						" Extra Salary: " + eArray[i].getExtraSalary() + "\n";
				myWriter.write(data);
			}
			
			myWriter.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		
		try {
			scanFile = new Scanner(file);
			
			for (int i=0; i<numberOfEmployee; i++) {
				String data = scanFile.nextLine();
				int bs = processData(data,"Basic Salary:");
				int es = processData(data,"Extra Salary:");
				double income = (bs + es * 2.5);
				System.out.println(data + " Income: " + income);
			}
			
			scanFile.close();
		}catch (FileNotFoundException ex) {
			ex.printStackTrace();
		}
		
		scan.close();
	}
}