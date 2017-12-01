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
    
    public void addCoursesToTeacher() {
    	System.out.println("Enter the Teacher's ID");
    	Scanner in = new Scanner(System.in);
    	String st = in.nextLine();
    	System.out.println("Enter the course name");
    	String st2 = in.nextLine();
    	boolean q = false;
    	Teacher sq=new Teacher(st);
    	for(int i = 0; i < DB.Teachercourses.size(); i++) {
    	
    	}
    	//DB.Teachercourses.add(new Course(st, sq,3));
    	
    }
    
    
    public int editSchedule() {
        return 0;
    }

    
    public int editNews() {
        return 0;
    }
}

