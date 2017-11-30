import java.util.Scanner;

/**
 */
public class Manager extends Employee {
    /**
     * @return 
     */
    public void addCourse(Course course) {
    	
    	System.out.println("To add course write Teacher's ID");
    	Scanner t= new Scanner(System.in);
    	String TeacherID=t.nextLine();
    	
    	for (int i=0; i<DB.userDataList.size(); i++) {
			if (DB.userDataList.get(i).id.equals(TeacherID)) {
			
			}
    }
    }
    /**
     * @return 
     */
    public int editSchedule() {
        return 0;
    }

    /**
     * @return 
     */
    public int editNews() {
        return 0;
    }
}

