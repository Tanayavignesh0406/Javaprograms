package decisionandlooping;

import java.util.Scanner;

public class SumRange {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		int lower = sc.nextInt();
		int upper = sc.nextInt();
		int sum = 0;
		int i = lower;
		
		while(i<=upper){
			sum = sum+i;
			i++;
		
		}
		System.out.println("the total sum in range is "+sum);
		

	}


}