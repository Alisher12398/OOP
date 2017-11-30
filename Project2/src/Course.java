import java.util.*;

public class Course {
	private Teacher teacher;
	private Student[] students;

	
	public Course(int maxStudents, Teacher teacher) {
		students = new Student[maxStudents];
		this.teacher = teacher;		
	}
	
	public void addStudent(Student student) {
		for(int i = 0; i < students.length; i++) {
			if(student == students[i]) 
				continue;
			
			if(students[i] == null) {
				students[i] = student;
				return;
			}
		}
	}
	
	public Teacher getTeacher() {
		return teacher;
	}
	
	public Student[] getStudents() {
		return Arrays.copyOf(students, students.length);
	}
	
	public boolean isFull() {
		boolean full = true;
		
		for(Student student: students) 
			full = student != null;
		
		return full;
	}
} 
