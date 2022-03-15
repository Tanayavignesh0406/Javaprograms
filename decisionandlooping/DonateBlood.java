package decisionandlooping;
import java.util.Scanner;

public class DonateBlood {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age: ");
		int age = sc.nextInt();
		System.out.println("Enter the weight: ");
		int weight = sc.nextInt();
		if(age >= 18 && weight >= 40) {
			System.out.println("Eligible for blood donation");
			
		}
		else {
			System.out.println("Not Eligible");		
		}
		
	}


}