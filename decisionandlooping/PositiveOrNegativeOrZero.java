package decisionandlooping;

import java.util.Scanner;

public class PositiveOrNegativeOrZero {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int number = sc.nextInt();
		if(number>0) {
			System.out.println("Positive number");
			
		}
		else if(number<0) {
			System.out.println("Negative number");
		}
		else {
			System.out.println("Zero");
		}
		
		
	}

}
