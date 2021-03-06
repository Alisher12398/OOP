import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;

public class DB {
	 static List<User> userDataList = new ArrayList<User>();
	 static List<Student> studentDataList = new ArrayList<Student>();
	 static Vector<Course> Teachercourses = new Vector<Course>();
	 static Vector<Course> Studentcourses = new Vector<Course>();
	 static List<Teacher> teacherDataList = new ArrayList<Teacher>();	
	 

	 
	 
	 public static void transferToStudent() throws IOException  {
			for (int i = 0; i < userDataList.size(); i++) {
				if (userDataList.get(i).status.equals("student")) {
					String a = userDataList.get(i).id;
					studentDataList.add(new Student(a));
				}
				
			Student.Calculate();
			
		BufferedReader bf2 = new BufferedReader(new FileReader("C:\\OOPGit\\OOP\\Project2\\students.txt"));
		BufferedWriter bw2 = new BufferedWriter(new FileWriter("C:\\OOPGit\\OOP\\Project2\\students.txt"));
		
		try {
			for (int q=0; q<studentDataList.size(); q++) {
				bw2.write(studentDataList.get(q).id + " " + studentDataList.get(q).attestation_1 + " " + 
			studentDataList.get(q).attestation_2 + " " + 
			studentDataList.get(q).finalexam + " " + 
			studentDataList.get(q).overall);
	      	  	bw2.newLine();	
			}
		} catch(IOException e) {};
		
		bw2.close();
		bf2.close();
			}
	 }
	 
	 
	 public static void transferToTeacher() throws IOException  {
			for (int i = 0; i < userDataList.size(); i++) {
				if (userDataList.get(i).status.equals("teacher")) {
					String a = userDataList.get(i).id;
					teacherDataList.add(new Teacher(a));
				}   
			
		BufferedReader bf3 = new BufferedReader(new FileReader("C:\\OOPGit\\OOP\\Project2\\teachers.txt"));
		BufferedWriter bw3 = new BufferedWriter(new FileWriter("C:\\OOPGit\\OOP\\Project2\\teachers.txt"));
		
		try {
			for (int q=0; q<teacherDataList.size(); q++) {
				bw3.write(teacherDataList.get(q).id);
	      	  	bw3.newLine();	
			}
		} catch(IOException e) {};
		
		bw3.close();
		bf3.close();
			}
	 }
	 
} 