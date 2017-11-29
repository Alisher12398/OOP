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
	static List<User> userDataList = new ArrayList<User>();
	public static void main(String args[]) throws IOException {
		/*RandomAccessFile Rw= null;
		try{
			Rw= new RandomAccessFile("a.txt", "rw");
		}
		catch (IOException e) {}*/
		
		addUser();
		addUser();
		addUser();
		updateUser();
		
	}

	public static void addUser() throws IOException {
		System.out.println("Введите нового пользователя в формате:" + "\n" + "Имя" + "\n" + "Фамилия" + "\n" + "ID" + "\n" + "Пароль");
		
		Scanner in = new Scanner(System.in);
		
		int i=0;
		String name1 = null,name2 = null,name3 = null,name4 = null;
		String aname1 = null,aname2 = null,aname3 = null,aname4 = null;
		
		
		//while (in.hasNext())
		for(int u=0; u<5; u++){
			//String[] line = in.nextLine().split(";");
			
			if (i==0) {
				//name1=line[0];
				name1=in.nextLine();
				System.out.println("***" + "New" + " ***");
				i++;
			}
			
			if (i==1) {
				//name2=line[0];
				name2=in.nextLine();
				System.out.println("***" + "New" + " ***");
				i++;
			}
			
			if (i==2) {
				//name3=line[0];
				name3=in.nextLine();
				System.out.println("***" + "New" + " ***");
				i++;
			}
			
			if (i==3) {
				//name4=line[0];
				name4=in.nextLine();
				System.out.println("***" + "New" + " ***");
				i++;
			}
			
		}
		int q=userDataList.size();
		userDataList.add(new User(name1,name2,name3,name4));
		System.out.println("***" + "New user" +  " ***");
		
		BufferedReader bf = new BufferedReader(new FileReader("C:\\Users\\Алишер\\eclipse-workspace\\Project2\\output.txt"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\Алишер\\eclipse-workspace\\Project2\\output.txt"));
		//File file = new File("C:\\Users\\Алишер\\eclipse-workspace\\Project2\\output2.txt");
		 
		try{
			 //PrintWriter pw = new PrintWriter(new FileOutputStream(file));
	          // int datList = userDataList.size();
	           
	           //for (User s : userDataList){
	             		for(int y = 0; y < userDataList.size(); y++) {
	            	   bw.write(userDataList.get(y).name + " " + userDataList.get(y).surname + " " + userDataList.get(y).id + " " + userDataList.get(y).password);
	            	   bw.newLine();	             		}
	            	  
	           //}
	       } catch(IOException e) {}
		
		 bf.close();
		 bw.close();
		 
		 
		 /*
		Scanner in = new Scanner(System.in);
		while (in.hasNext()){
			   String[] line = in.nextLine().split(";");
			}
		*/
	}
	
	public static void updateUser() throws IOException {
		System.out.println("Введите ID студента");
		String ID2;
		Scanner in = new Scanner(System.in);
		ID2=in.nextLine();
				
		BufferedReader bf1 = new BufferedReader(new FileReader("C:\\Users\\Алишер\\eclipse-workspace\\Project2\\output.txt"));
		BufferedWriter bw1 = new BufferedWriter(new FileWriter("C:\\Users\\Алишер\\eclipse-workspace\\Project2\\output.txt"));
		
		for (int i=0; i<userDataList.size(); i++) {
			if (userDataList.get(i).equals(ID2)) {
				System.out.println("Введите поле, которые хотите заменить");
				Scanner sc= new Scanner(System.in);
				String updateField=in.nextLine();
				try {
				switch(updateField) {
				
				case "name":
					
					updateField=in.nextLine();
					userDataList.get(i).name= updateField;
					bw1.write(userDataList.get(i).name);
					break;
					
				case "surname":
					
					updateField=in.nextLine();
					userDataList.get(i).surname= updateField;
					break;
					
				
				case "password":
					
					updateField=in.nextLine();
					userDataList.get(i).password= updateField;
					break;
					
					
				}
			}catch(IOException e) {}
		}
		
		} 
		
		bw1.close();
		bf1.close();
	}
	
	public void removeUser() {
		
	}
	
	
}