import java.io.Serializable;
import java.util.Vector;

public class Executor extends Employee {
	Vector<Order> orders = new Vector<>();
	
	public Executor() {
		super();
	}
}