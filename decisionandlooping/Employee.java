package decisionandlooping;

public class Employee {
	int id = 50;
	String name;
	void getValues(int i, String n) {
		id = i;
		name = n;
	}
	public static void main(String args[]) {
		int id = 1;
		String name="Rishi";
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		Employee e3 = new Employee();
		e1.getValues(1,"Rishi");
		e2.getValues(2,"Ramu");
		e3.getValues(3,"Riya");
		System.out.println(e1.id);
		System.out.println(e1.name);
		System.out.println(e2.id);
		System.out.println(e2.name);
		System.out.println(e3.id);
		System.out.println(e3.name);
		
		
		
	}

}
