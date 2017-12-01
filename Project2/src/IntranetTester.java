import java.io.File;
import java.io.IOException;
import java.util.*;

public class IntranetTester {
	
	private static final int PAGE_SIZE = 25;

	public static void forExit() throws IOException {

		
		
		Teacher teacher = new Teacher();
		Admin admin = new Admin();
		Student student = new Student();
		Manager manager = new Manager();
		
		User.LogIn();
		
		System.out.println("Your Name: " + User.currentName);
		System.out.println("Your status: " + User.currentStatus + "\n");

		switch (User.currentStatus) {
		
			case "student":
				student.AvailableMethods();
			break;
			
			case "admin":
				admin.AvailableMethods();
			break;
			
			case "teacher":
				teacher.AvailableMethods();
			break;
			
			case "manager":
				manager.AvailableMethods();
			break;
	
		}
	}
	
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Scanner in = new Scanner(System.in);
		
		System.out.println("*** Welcome to KBTU Intranet ***" + "\n");

		DB.userDataList.add(new User("Alisher","Kh", "16BD01", "1q2w", "student"));
		DB.userDataList.add(new User("QWERTY","QW", "16BD02", "1q2w", "teacher"));
		DB.userDataList.add(new User("Yerkebulan","ZH", "16BD03", "1q2w", "student"));
		DB.userDataList.add(new User("qweqwe","ASD", "16BD04", "1q2w", "student"));
		DB.userDataList.add(new User("AAA","asda", "16BD05", "1q2w", "student"));
		DB.userDataList.add(new User("ASDAS","qqqq", "16BD06", "1q2w", "executor"));
		DB.userDataList.add(new User("admin","admin", "admin", "admin", "admin"));
		DB.userDataList.add(new User("qWQWD","awd", "16BD08", "1q2w", "student"));
		DB.userDataList.add(new User("ASDASd","awda", "16BD09", "1q2w", "teacher"));
		DB.userDataList.add(new User("Zz","awd", "16BD10", "1q2w", "teacher"));
		DB.userDataList.add(new User("zxc","awd", "16BD11", "1q2w", "student"));
		DB.userDataList.add(new User("zxcz","awd", "16BD11", "1q2w", "student"));
		DB.userDataList.add(new User("asd","adw", "16BD12", "1q2w", "student"));
		DB.userDataList.add(new User("asd","adw", "16BD13", "1q2w", "manager"));
		
		DB.transferToStudent();
		DB.transferToTeacher();
		forExit();
		 
	}
}

