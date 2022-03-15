package decisionandlooping;

class Student{
	int rollno;
	String department;
}
public class CreatingObjects {
	public static void main(String args[]) {
	
		Student s1 = new Student();
		Student s2 = new Student();
		
		System.out.println(s1.rollno +", "+ s1.department);
		System.out.println(s2.rollno +", "+ s2.department);
	}
	
}
