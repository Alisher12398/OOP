import java.

public class Employee extends User {
	
    private int salary;
    
    public Employee(String login, String password, String name, double salary) {
        super(login, password, name);
        this.salary = salary;
    }

    private int yearofStartWork;

    private int room;

    public void sendReport() {
    }
    
    public static void CountSalary() {
    	
    }
    
}

