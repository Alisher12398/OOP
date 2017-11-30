import java.lang.*;
import java.util.ArrayList;
import java.util.List;

public class Teacher extends Employee {
	
	
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