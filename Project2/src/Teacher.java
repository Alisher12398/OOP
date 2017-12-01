import java.io.IOException;
import java.io.Serializable;

import java.lang.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

public class Teacher extends Employee implements Serializable {
	public enum Degree{PhD, MASTER};
	private Degree degree = Degree.MASTER;
	Vector<Course> courses = new Vector<Course>();
	public Teacher() {}
	public static String id;
	public String a;
	
	public Teacher(String id) {
		this.id=id;
	}
	
	public static void viewCourse() {
		/*for (int i=0; i<DB.courses.size(); i++) {
			System.out.println(DB.courses.get(i) + "\n");
		}*/
		for (int i=0; i<DB.Teachercourses.size(); i++) {
			System.out.println(DB.Teachercourses.get(i) + " ");
		}
		
	}
	
	public void manageCourseFiles() {
	
	}
	
	
	
	public static void AvailableMethods() throws IOException{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Press 1 to view courses");
		System.out.println("Press 2 to view students");
		System.out.println("Press 3 to put marks to 1st attestation");
		System.out.println("Press 4 to put marks to 2nd attestation");
		System.out.println("Press 5 to put marks to final exam");
		System.out.println("Press 6 to send order");
		System.out.println("Press 7 to exit");
		int method=sc.nextInt();
		
		switch (method) {
		
		case 1:
			viewCourse();
			break;
			
		case 2:
			viewStudents();
			break;

		case 3:
			putMarks1();
			break;
			
		case 4:
			putMarks2();
			break;
			
		case 5:
			putMarks3();
			break;	
		
		case 6:
			sendReport();
			break;	
			
		case 7:
			System.out.println("\n" + "\n" + "\n" + "\n" + "************************************" +
					"************************************" + "\n" + "\n" + "\n" + "\n");
			IntranetTester.forExit();
			break;
		}
		
		
		
	}
	
	public static void viewStudents() {
		
	}
	
	public static  void putMarks1() throws IOException {
		System.out.println("Enter Student's ID");
		Scanner sc=new Scanner(System.in);
		
		String id=sc.nextLine();
		
		double m = 0;
		System.out.println("Enter a mark");
		m=sc.nextDouble();
		for (int i=0; i<DB.studentDataList.size(); i++) {
			if (DB.studentDataList.get(i).equals(id)) {
				DB.studentDataList.get(i).attestation_1=Student.attestation_1+m;
				System.out.println("***" + DB.studentDataList.get(i).attestation_1 + " " + DB.studentDataList.get(i).overall);
			}
		}
		IntranetTester.forExit();
		
	}
	
	public static void putMarks2() throws IOException {
		System.out.println("Enter Student's ID");
		Scanner sc=new Scanner(System.in);
		
		String id=sc.nextLine();
		
		double m=0;
		System.out.println("Enter a mark");
		m=sc.nextDouble();
		for (int i=0; i<DB.studentDataList.size(); i++) {
			if (DB.studentDataList.get(i).equals(id)) {
				DB.studentDataList.get(i).attestation_2=Student.attestation_2+m;
			}
		}
		IntranetTester.forExit();
	}
	
	public static void putMarks3() throws IOException {
		System.out.println("Enter Student's ID");
		Scanner sc=new Scanner(System.in);
		
		String id=sc.nextLine();
		
		double m=0;
		System.out.println("Enter a mark");
		m=sc.nextDouble();
		for (int i=0; i<DB.studentDataList.size(); i++) {
			if (DB.studentDataList.get(i).equals(id)) {
				DB.studentDataList.get(i).finalexam=Student.finalexam+m;
			}
		}
		IntranetTester.forExit();
	}
	
	public static void sendOrder() {
		
	}
}