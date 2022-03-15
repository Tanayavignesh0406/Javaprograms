package decisionandlooping;

import java.util.Scanner;

public class GradeRange {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int mark = sc.nextInt();
		if(mark >= 91 && mark <= 100) {
			System.out.println("A+");
		} 
		else if(mark >= 81 && mark <= 90) {
			System.out.println("A");
		}
		else if(mark >= 71 && mark <= 80) {
			System.out.println("B+");
		}
		else if(mark >= 61 && mark <= 70) {
			System.out.println("B");
		}
		else if(mark >= 50 && mark <= 60) {
			System.out.println("C");
		}
		else {
			System.out.println("Withheld");
		}
		
	}

}
