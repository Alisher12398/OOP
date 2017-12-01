import java.io.Serializable;
import java.lang.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

public class Teacher extends Employee implements Serializable {
	public enum Degree{PhD, MASTER};
	private Degree degree = Degree.MASTER;
	Vector<Course> courses = new Vector<Course>();
	public Teacher() {}
	public Teacher(User teach) {
		
	}
	public String a;
	public Teacher(String a) {
		this.a=a;
	}
	
	public static void viewCourse() {
		for (int i=0; i<DB.courses.size(); i++) {
			System.out.println(DB.courses.get(i) + "\n");
		}
		
	}
	
	public void manageCourseFiles() {
	
	}
	
	public static void AvailableMethods(){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Press 1 to view courses");
		System.out.println("Press 2 to view students");
		System.out.println("Press 3 to put marks");
		System.out.println("Press 4 to send order");
		
		int method=sc.nextInt();
		
		switch (method) {
		
		case 1:
			viewCourse();
			break;
			
		case 2:
			viewStudents();
			break;

		case 3:
			putMarks();
			break;
			
		case 4:
			sendOrder();
			break;
			
		
		}
		
	}
	
	public static void viewStudents() {
		
	}
	
	public static void putMarks() {
		
	}
	
	public static void sendOrder() {
		
	}
}