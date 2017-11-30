import java.util.*;

public abstract  class Course {
	private Teacher teacher;
	private Student[] students;
	private User id;
	
	protected Course(int maxStudents, Teacher teacher) {
		students = new Student[maxStudents];
		this.teacher = teacher;
		
		
	}
} 
