import java.util.Scanner;

import projectoop.ManagerType;

public class Manager extends Employee {
	private ManagerType type;
	 public Manager() {
	        super();
	    }
	 
	 
	
    public void addCourse(Course course) {
    	
    	System.out.println("To add course write Teacher's ID");
    	Scanner t= new Scanner(System.in);
    	String TeacherID=t.nextLine();
    	
    	for (int i=0; i<DB.userDataList.size(); i++) {
			if (DB.userDataList.get(i).id.equals(TeacherID)) {
			
			}
    }
    }
    
    
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

