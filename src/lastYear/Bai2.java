package lastYear;

public class Bai2 {

	public static void main (String[] args) {
//		sampleCourses();
		Course[] courseList = new Course[3];
		Course.readFromFile("Course.txt", courseList);
		for (Course course : courseList) {
			course.printOut();
		}
		
//		sampleLecturer(courseList);
		Lecturer[] lecturerList = new Lecturer[3];
		Lecturer.readFromFile("Lecturer.txt", courseList, lecturerList);
		for (Lecturer lecturer : lecturerList) {
			lecturer.printOut();
		}
		
//		sampleStudent(courseList);
		Student[] studentList = new Student[3];
		Student.readFromFile("Students.txt", studentList, courseList);
		for (Student st : studentList) {
			st.printOut();
			st.isPassed();
		}
		
	}
	
	public static void sampleCourses() {
		Course ads = new Course("Algorithm and Data Structure","ADS" );
		Course oop = new Course("Object Oriented Programming","OOP" );
		Course app = new Course("Advanced Programming with Python","APP" );
		ads.writeToFile();
		oop.writeToFile();
		app.writeToFile();
	}
	
	public static void sampleLecturer(Course[] courseList) {
		Lecturer Quang = new Lecturer("Doan Nhat Quang","DNQ",courseList[0]);
		Lecturer Phuong = new Lecturer("Nghiem Thi Phuong","NTP",courseList[1]);
		Lecturer Son = new Lecturer("Tran Giang Son","TGS",courseList[2]);
		Quang.writeToFile();
		Phuong.writeToFile();
		Son.writeToFile();
	}
	
	public static void sampleStudent(Course[] courseList) {
		Student Minh = new Student("Nguyen Trong Minh", "22bi13304", courseList);
		Student Hung = new Student("Nguyen Manh Hung", "22bi13254", courseList);
		Student HoangTran = new Student("Tran Luong Hoang Anh", "22bi13039", courseList);
		Minh.writeToFile();
		Hung.writeToFile();
		HoangTran.writeToFile();
	}
}
