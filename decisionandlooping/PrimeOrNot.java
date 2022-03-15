package decisionandlooping;

import java.util.Scanner;

public class PrimeOrNot{
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		int number =sc.nextInt();
		for(int i=2; i < number; i++) {
			if (number % i == 0) {
				System.out.println("Not Prime Number ");
				System.exit(0);
			}
		}
		System.out.println("Prime Number ");
	}
}