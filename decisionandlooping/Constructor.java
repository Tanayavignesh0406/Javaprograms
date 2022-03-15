package decisionandlooping;

class Staff{
	int staffid;
	String staffname;
	// default constructor
	Staff(){
		this.staffid = 1;
		this.staffname = "rishi";
	}
	
	// parametrized constructor
	Staff(int id, String name) {
		this.staffid = id;
		this.staffname = name;
	}
}

public class Constructor {
	public static void main(String args[]) {

		
		Staff s1 = new Staff();
		
		Staff s2 = new Staff(6, "Rishi");

		System.out.println(s1.staffid + ", " + s1.staffname);
		System.out.println(s2.staffid + ", " + s2.staffname);
		
	}
	
	
	

}
