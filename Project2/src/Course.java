import java.util.*;

public class Course {
	private String courseName, code, courseFiles;
	private int credits = 3;
	
	Teacher teacher = new Teacher();
	public String getCourseName() {
		return courseName;
	}
	
	public void setCourseName(String courseName) {
		this.courseName = courseName;
		Random generator = new Random();
		int i = generator.nextInt(900) + 100;
		this.code = courseName + Integer.toString(i);
	}
	
	public String getCode() {
		return code;
	}
	public int getCredits() {
		return credits;
	}
	
	public void setCredits(int credits) {
		this.credits = credits;
	}
	
	public String getCourseFiles() {
		return courseFiles;
	}
	
	public void setCourseFiles(String courseFiles) {
		this.courseFiles = courseFiles;
	}
	
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Course other = (Course) obj;
		if (code == null) {
			if (other.code != null)
				return false;
		} else if (!code.equals(other.code))
			return false;
		return true;
	}
	
	public String toString() {
		return "Course [courseName=" + courseName + "]";
	}
} 
