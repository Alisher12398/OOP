import java.util.Scanner;

public class Parent extends User {
    
    public void viewMarks() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your child's ID");
        String id2= sc.nextLine();
        for (int i=0; i<DB.studentDataList.size(); i++) {
        	if (DB.studentDataList.get(i).id.equals(id2)) {
        		System.out.println("");
        	}
        }
    }
}

