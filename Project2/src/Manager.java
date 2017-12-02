import java.io.IOException;
import java.util.Scanner;




public class Manager extends Employee {
	private TypeManager type;
	 public Manager() {
	        super();
	    }
	 public TypeManager getType() {
	        return type;
	    }
	    public void setType(TypeManager type) {
	    	this.type = type;
	    }
	 
	 public int hashCode() {
	        int result = super.hashCode();
	        result = 31 * result + (type != null ? type.hashCode() : 0);
	        return result;
	    }
	 
	 public boolean equals(Object o) {
	        if (this == o) return true;
	        if (o == null || getClass() != o.getClass()) return false;
	        if (!super.equals(o)) return false;

	        Manager manager = (Manager) o;

	        return type == manager.type;
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
    
    public static void addCoursesToTeacher() {
    	System.out.println("Enter Teacher's ID");
    	Scanner sc= new Scanner(System.in);
    	
    	String st1= sc.nextLine();
    	
    	for (int i=0; i<DB.teacherDataList.size(); i++) {
    		if (DB.teacherDataList.get(i).id.equals(st1)) {
    			System.out.println("Enter course name");
    			String st2=sc.nextLine();
    			DB.Teachercourses.add(new Course(st2));
    		}
    	}
    	
    }
    
    
    public static void AvailableMethods() throws IOException{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Press 1 to add course to teacher");
		System.out.println("Press 2 to exit");
		int method=sc.nextInt();
		
		switch (method) {
		
		case 1:
			addCoursesToTeacher();
			break;
			
		case 2:
			System.out.println("\n" + "\n" + "\n" + "\n" + "************************************" +
					"************************************" + "\n" + "\n" + "\n" + "\n");
			IntranetTester.forExit();
			break;
		}
		
		
		
	}
    
    
   
}

