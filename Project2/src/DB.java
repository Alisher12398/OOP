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
import java.util.ArrayList;
import java.util.List;

public class DB {
	 static List<User> userDataList = new ArrayList<User>();
	 static List<Student> studentDataList = new ArrayList<Student>();
	 static List<Course> courses = new ArrayList<Course>();
	 static List<Teacher> teacherDataList = new ArrayList<Teacher>();	
	 
	 public static void transferToStudent() throws IOException  {
			for (int i = 0; i < userDataList.size(); i++) {
				if (userDataList.get(i).status.equals("student")) {
					String a = userDataList.get(i).id;
					studentDataList.add(new Student(a,1.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,3.0,0.0,0.0,0.0,0.0,0.0));
				}
				
			Student.Calculate();
			
		BufferedReader bf2 = new BufferedReader(new FileReader("C:\\OOPGit\\OOP\\Project2\\students.txt"));
		BufferedWriter bw2 = new BufferedWriter(new FileWriter("C:\\OOPGit\\OOP\\Project2\\students.txt"));
		
		try {
			for (int q=0; q<studentDataList.size(); q++) {
				bw2.write(studentDataList.get(q).id);
	      	    bw2.write(studentDataList.get(q).att1);
	      	   // bw2.write((int) (studentDataList.get(q).attestation_2) );
	      	   // bw2.write((int) (studentDataList.get(q).finalexam) );
	      	  	bw2.newLine();	
	      	  	System.out.println(Student.att1);
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
	      	  	System.out.println(Student.att1);
			}
		} catch(IOException e) {};
		
		bw3.close();
		bf3.close();
			}
	 }
	 
}