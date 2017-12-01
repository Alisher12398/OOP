import java.io.IOException;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Vector;


public class Student extends User implements Serializable{
	String id;
	private Grade grade;
	
	
	public Student(String id) {
		this.id = id;
	}
	
	public Student() {}
	
	protected static double attestation_1=0, attestation_2=0, overall=0, finalexam=0;
	public static int att1;
	
	public static void Calculate(){
	overall = attestation_1+attestation_2+finalexam;
	
	}
	
	public static void AvailableMethods() throws IOException {
Scanner sc=new Scanner(System.in);
		
		System.out.println("Press 1 to view courses");
		System.out.println("Press 2 to register for courses");
		System.out.println("Press 3 to view course files");
		System.out.println("Press 4 to info about teacher of a specific course");
		System.out.println("Press 5 to view marks");
		System.out.println("Press 6 to rate teachers");
		System.out.println("Press 7 to exit");
		int method=sc.nextInt();
		
		switch (method) {
		
		case 1:
			viewCourses();
			break;
			
		case 2:
			registerForCourses();
			break;

		case 3:
			viewCourseFiles();
			break;
			
		case 4:
			viewInfo();
			break;
		case 5:
			viewMarks();
			break;
		case 6:
			rateTeachers();
			break;
		case 7:
			System.out.println("\n" + "\n" + "\n" + "\n" + "************************************" +
					"************************************" + "\n" + "\n" + "\n" + "\n");
			IntranetTester.forExit();
			break;
		}
	
	}
	
	public static void viewCourses() {
		
	}
	public static void registerForCourses() {}
	public static void viewCourseFiles() {}
	public static void viewInfo() {}
	public static void viewMarks() {}
	public static void rateTeachers() {}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public Student (String id, double attestation_1) {
		this.id=id;
		this.attestation_1=attestation_1;
		//this.attestation_2=attestation_2;
		//this.finalexam=finalexam;
	}
	/*
	int yearStudy;
	Vector<Course> course = new Vector<Course>();
	HashMap<Course, Vector<Mark>> mark = new HashMap<Course, Vector<Mark>>();
	public Student() {
	}
	public Student(User tmp){
		this.name = tmp.getName();
		this.surname = tmp.getSurname();
		this.login = tmp.getLogin();
		this.password = tmp.getPassword();
		
	}
	

	
	public int getYearStudy() {
		return yearStudy;
	}

	public void setYearStudy(int yearStudy) {
		this.yearStudy = yearStudy;
	}
	public void run() throws IOException{
		while(true){
			Scanner in = new Scanner(System.in);
			System.out.println("Type 1 to register for a course");
			System.out.println("Type 2 to view your courses");
			System.out.println("Type 3 to view your marks");
			System.out.println("Type 4 to view your transcript");
			
			System.out.println("Type 0 to exit");
			String cmd = in.next();
			if (cmd.equals("1")){
				for (int i=0; i<DataBase.allCT.size(); i++)
					System.out.println(i+1 + ")" + DataBase.allCT.get(i).getCourseName() + " is taught by " + DataBase.allCT.get(i).ins.toString());
					System.out.println("Choose course, type anything else to Exit");
					int choice;
					try{
						choice = in.nextInt();
						choice--;
						if (choice < 0 || choice >= DataBase.allCT.size())
							choice = -1;
							
					}catch(Exception e){choice = -1;}
					if (choice != -1){	
						course.add(DataBase.allCT.get(choice));
						if (DataBase.regStud.containsKey(DataBase.allCT.get(choice))){
							Vector<Student> cur = DataBase.regStud.get(DataBase.allCT.get(choice));
							cur.add(this);
						}else{
							Vector<Student> cur = new Vector<Student>();
							cur.add(this);
							DataBase.regStud.put(DataBase.allCT.get(choice), cur);							
						}
						System.out.println("Course succesfully registered");
					}
			}
			if (cmd.equals("2")){
				for (int i=0; i<course.size(); i++)
						System.out.println(i+1+") " + course.get(i));				
			}
			if (cmd.equals("3")){
				if (course.size() == 0){
					System.out.println("No courses registered");
					continue;
				}
				for (int i=0; i<course.size(); i++)
					System.out.println(i+1+") " + course.get(i));
				System.out.println("Choose course to view marks, or anything else to Exit");
				int choice;
				try{
					choice = in.nextInt();
					choice--;
					if (choice < 0 || choice >= course.size())
						choice = -1;
				}catch(Exception e){
					choice = -1;
				}
				if (choice != -1){
					int sum = 0;
					if (mark.containsKey(course.get(choice))){
						Vector<Mark> cur = mark.get(course.get(choice));
						for (int i=0; i<cur.size(); i++){
							System.out.print(cur.get(i).mark + " ");
							sum += cur.get(i).mark;
						}
					}
					System.out.println("\nSum of your marks: " + sum);
				}
			}
			if (cmd.equals("4")){
				if (course.size() == 0){
					System.out.println("No courses registered");
					continue;
				}
				double GPA = 0, cnt = 0;
				for (int i=0; i<course.size(); i++){
					System.out.println(i+1+") " + course.get(i));
					int choice = i;
					if (choice < 0 || choice >= course.size())
						choice = -1;
					if (choice != -1){
						int sum = 0;
						if (mark.containsKey(course.get(choice))){
							Vector<Mark> cur = mark.get(course.get(choice));
							for (int j=0; j<cur.size(); j++){
								//System.out.print(cur.get(i).mark + " ");
								sum += cur.get(j).mark;
							}
						}
						Mark tmp = new Mark();
						System.out.println("Sum of your marks: " + sum + "this is: " + tmp.conMark(sum));
						cnt ++;
						GPA += tmp.getGPA(sum);
					}
				}
				GPA /= cnt;
				System.out.println("Your GPA is: " + GPA);
			}
			if (cmd.equals("0")){
				Driver.save();
				break;	
			}
			
		}
		
	}
	@Override
	public String toString() {
		return "Student [yearStudy=" + yearStudy + ", getSurname()="
				+ getSurname() + ", getName()=" + getName() + "]";
	}
	*/
	
	

}
