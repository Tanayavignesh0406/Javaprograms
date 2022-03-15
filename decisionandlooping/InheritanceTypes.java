package decisionandlooping;

class Vehicle{
	String brake = "yes";
}
class Car extends Vehicle{
	String gear = "yes";
}
class HondaCity extends Car{
	int persons = 5;
	String airBag = "yes";

}
public class InheritanceTypes {
	public static void main(String args[]) {
		HondaCity city = new HondaCity();
		System.out.println(city.persons + " " + city.airBag + " " + city.brake + " " + city.gear);
		
	}
}
