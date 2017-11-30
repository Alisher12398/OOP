import java.io.Serializable;
import java.lang.*;
import java.util.ArrayList;
import java.util.List;
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
	
	public void viewStudents() {
		
	}
	
	public void putMarks() {
		
	}
	
	public void sendOrder() {
		
	}
}