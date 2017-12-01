import java.util.TreeMap;
import java.util.Set;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.stream.*;
import java.io.*;
import java.util.stream.*;
import java.io.*;
import java.util.Scanner;
import java.util.List;

public class Admin extends User {

	public static void addUser() throws IOException {
		System.out.println("Write info about new User" + "\n" + "Name" + "\n" + "Surname" + "\n" + "ID" + "\n" + "Password" + "\n" + "Status");
		
		Scanner in = new Scanner(System.in);
		
		int i=0;
		String name1 = null,name2 = null,name3 = null,name4 = null,name5=null;
		
		for(int u=0; u<5; u++){
			
			if (i==0) {
				name1=in.nextLine();
				System.out.println("***" + "New" + " ***");
				i++;
			}
			
			if (i==1) {
				name2=in.nextLine();
				System.out.println("***" + "New" + " ***");
				i++;
			}
			
			if (i==2) {
				name3=in.nextLine();
				System.out.println("***" + "New" + " ***");
				i++;
			}
			
			if (i==3) {
				name4=in.nextLine();
				System.out.println("***" + "New" + " ***");
				i++;
			}
			if (i==4) {
				name5=in.nextLine();
				System.out.println("***" + "New" + " ***");
				i++;
			}
			
		}
		int q=DB.userDataList.size();
		
		DB.userDataList.add(new User(name1,name2,name3,name4,name5));
		System.out.println("***" + "New user" +  " ***");
		
		BufferedReader bf = new BufferedReader(new FileReader("C:\\OOPGit\\OOP\\Project2\\output.txt"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\OOPGit\\OOP\\Project2\\output.txt"));
		
		 
		try{
			WritetoFile();
	       } catch(IOException e) {}
		
		bf.close();
		bw.close();
		 		
	}
	
	public static void WritetoFile() throws IOException {
		
		BufferedReader bf2 = new BufferedReader(new FileReader("C:\\OOPGit\\OOP\\Project2\\output.txt"));
		BufferedWriter bw2 = new BufferedWriter(new FileWriter("C:\\OOPGit\\OOP\\Project2\\output.txt"));
		
		try {
			for (int q=0; q<DB.userDataList.size(); q++) {
				bw2.write(DB.userDataList.get(q).name + " " + DB.userDataList.get(q).surname + " " + DB.userDataList.get(q).id + " " + DB.userDataList.get(q).password + " " + DB.userDataList.get(q).status);
	      	  	bw2.newLine();	
			}
		} catch(Exception e) {};
		
		bw2.close();
		bf2.close();
		
	}
		
	public static void AvailableMethods() throws IOException {
		Scanner sc=new Scanner(System.in);
				
				System.out.println("Press 1 to add user");
				System.out.println("Press 2 to edit user");
				int method=sc.nextInt();
				
				switch (method) {
				
				case 1:
					addUser();
					break;
					
				case 2:
					updateUser();
					break;

				}
			
			}
	
	
	public static void updateUser() throws IOException {
		
		System.out.println("Write Student's ID");
		String ID2;
		Scanner in = new Scanner(System.in);
		ID2=in.nextLine();

				
		BufferedReader bf1 = new BufferedReader(new FileReader("C:\\OOPGit\\OOP\\Project2\\output.txt"));
		BufferedWriter bw1 = new BufferedWriter(new FileWriter("C:\\OOPGit\\OOP\\Project2\\output.txt"));
		
		for (int i=0; i<DB.userDataList.size(); i++) {
			if (DB.userDataList.get(i).id.equals(ID2)) {
				System.out.println("What do you want to change? (name, surname, password, id");
				String updateField=in.nextLine();
			
				switch(updateField) {
				
				case "name":
					System.out.println("Write new name");
					updateField=in.nextLine();
					DB.userDataList.get(i).name= updateField;
					WritetoFile();
					break;
					
				case "surname":
					System.out.println("Write new surname");
					updateField=in.nextLine();
					DB.userDataList.get(i).surname= updateField;
					WritetoFile();
					break;
					
				
				case "password":
					System.out.println("Write new password");
					updateField=in.nextLine();
					DB.userDataList.get(i).password= updateField;
					WritetoFile();
					break;
					
				case "id":
					System.out.println("Write new id");
					updateField=in.nextLine();
					DB.userDataList.get(i).password= updateField;
					WritetoFile();
					break;	
				}
			}	
		
		} 
		bw1.close();
		bf1.close();
	}
	
	public static void removeUser() throws IOException {
		/*System.out.println("Write Student's ID");
		String ID3;
		Scanner in = new Scanner(System.in);
		ID3=in.nextLine();

		BufferedReader bf2 = new BufferedReader(new FileReader("C:\\OOPGit\\OOP\\Project2\\output.txt"));
		BufferedWriter bw2 = new BufferedWriter(new FileWriter("C:\\OOPGit\\OOP\\Project2\\output.txt"));
		
		for (int i=0; i<DB.userDataList.size(); i++) {
			if (DB.userDataList.get(i).id.equals(ID3)) {
				//DB.userDataList.remove(i);
				DB.userDataList.remove(DB.userDataList.get(i));
				}
			}
		
		WritetoFile();
		bf2.close();
		bw2.close();*/
		
	}
	
	
}
