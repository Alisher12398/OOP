import java.lang.*;
import java.util.stream.*;
import java.io.*;
import java.util.stream.*;
import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class User {
 protected String name;
 protected String surname;
 protected String password;
 protected String status;

 
 protected static String id;

 public void setName(String name) {
	 this.name = name;
    }
 public String getName() {
        return name;
    }
 public void setSurname() {
    }

 public void setId() {
    }

  public String getId() {
        return null;
    }
  
  public static void LogIn() throws IOException {
		BufferedReader bf = new BufferedReader(new FileReader("C:\\OOPGit\\OOP\\Project2\\output.txt"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\OOPGit\\OOP\\Project2\\output.txt"));
		Scanner in = new Scanner(System.in);
		
		System.out.println("Please, Log In");
		
		System.out.println("Write your ID here");
		String loginID=in.nextLine();
		
		boolean reg=false; 
		
		for (int i=0; i<DB.userDataList.size(); i++) {
			if (DB.userDataList.get(i).id.equals(loginID)) {	
				System.out.println("Write your password here");
				String loginPassword=in.nextLine();
					if (DB.userDataList.get(i).password.equals(loginPassword)) {
						reg=true;
					}
			}
		
		}
		
		if (reg==true) {
			System.out.println("Access razreshen");
		}
		else {
			System.out.println("Access ne razhreshen");
			LogIn();
		}
		bf.close();
		bw.close();
  }
  
  public User() { } 

  public User(String name, String surname, String id, String password, String status) {
     this.name = name;
     this.surname = surname;
     this.id = id;
     this.password = password;
     this.status = status;
    
  }
}

