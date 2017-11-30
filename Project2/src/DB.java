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
	 
	 
	 public static void transferToStudent() throws IOException  {
			for (int i = 0; i < userDataList.size(); i++) {
				if (userDataList.get(i).status.equals("student")) {
					String a = userDataList.get(i).id;
					studentDataList.add(new Student(a));
				}
	 
	 
	 
		BufferedReader bf2 = new BufferedReader(new FileReader("C:\\OOPGit\\OOP\\Project2\\students.txt"));
		BufferedWriter bw2 = new BufferedWriter(new FileWriter("C:\\OOPGit\\OOP\\Project2\\students.txt"));
		
		try {
			for (int q=0; q<studentDataList.size(); q++) {
				bw2.write(studentDataList.get(q).id);
	      	  	bw2.newLine();	
			}
		} catch(IOException e) {};
		
		bw2.close();
		bf2.close();
			}
	 }
}