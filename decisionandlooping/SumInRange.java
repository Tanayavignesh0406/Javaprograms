package decisionandlooping;

import java.util.Scanner;

public class SumInRange {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the lower number: ");
		int lower = sc.nextInt();
		System.out.println("Enter the upper number: ");
		int upper = sc.nextInt();
		int sum = 0;
		for(int i=lower;i<=upper;i++) {
			sum=sum+i;
			
		}
		System.out.println("The Sum within Range is: " +sum);
		
	}

}
