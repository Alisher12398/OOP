import java.io.File;
import java.io.IOException;
import java.util.*;

public class IntranetTester {
	
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Scanner in = new Scanner(System.in);
		
		System.out.println("*** Welcome to KBTU Intranet ***" + "\n");
		
		DB.userDataList.add(new User("Alisher","Kh", "16BD01", "1q2w", "student"));
		DB.userDataList.add(new User("QWERTY","QW", "16BD02", "1q2w", "teacher"));
		DB.userDataList.add(new User("Yerkebulan","ZH", "16BD03", "1q2w", "student"));
		
		User.LogIn();
		
		System.out.println("Your Name: " + User.currentName);
		System.out.println("Your status: " + User.currentStatus);
	}

}
