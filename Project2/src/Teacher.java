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
	
	
	
	public void viewCourse() {
		for (int i=0; i<DB.courses.size(); i++) {
			System.out.println(DB.courses.get(i) + "\n");
		}
		
	}
	
	public void manageCourseFiles() {
	
	}
	
	@Override
	public void AvaiableMethods(){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Press 1 to ");
		System.out.println("Press 2 to ");
		System.out.println("Press 3 to ");
		System.out.println("Press 4 to ");
		
		int method=sc.nextInt();
		
		switch (method) {
		
		case 1:
			
			break;
			
		case 2:
			
			break;

		case 3:
			
			break;
			
		case 4:
			
			break;
			
		
		}
		
	}
	
	public void viewStudents() {
		
	}
	
	public void putMarks() {
		
	}
	
	public void sendOrder() {
		
	}
}