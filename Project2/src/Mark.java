import java.io.Serializable;

public class Mark implements Serializable{
	int mark;
	Mark(){
	}
	Mark(int mark){
		this.mark = mark;
	}
     String conMark(int mx){
		if (mx >= 95)
			return "A";
		if (mx >= 90)
			return "A-";
		if (mx >= 85)
			return "B+";
		if (mx >= 80)
			return "B";
		if (mx >= 75)
			return "B-";
		if (mx >= 70)
			return "C+";
		if (mx >= 65)
			return "C";
		if (mx >= 60)
			return "C-";
		if (mx >= 55)
			return "D+";
		if (mx >= 50)
			return "D";
		return "F";
	}
     double getGPA(int mx){
		if (mx >= 95)
			return 4.0;
		if (mx >= 90)
			return 3.66;
		if (mx >= 85)
			return 3.33;
		if (mx >= 80)
			return 3;
		if (mx >= 75)
			return 2.66;
		if (mx >= 70)
			return 2.33;
		if (mx >= 65)
			return 2;
		if (mx >= 60)
			return 1.66;
		if (mx >= 55)
			return 1.33;
		if (mx >= 50)
			return 1;
		return 0;
	}
    
	@Override
	public String toString() {
		return Integer.toString(mark);
	}
	
}
