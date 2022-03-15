package javaassignment;

class Human{
	String name;
	Human(String name){
		this.name = name;
	}
}
public class DisplayName {
	public static void main(String args[]) {
		Human tanya = new Human("tanya");
		System.out.println(tanya.name);
	}

}
