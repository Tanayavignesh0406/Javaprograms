package javaassignment;

import java.util.Scanner;

public class TwoIntegers {
	public static void main(String args[]){
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter number1");
		int number1 = sc.nextInt();
		System.out.println("Enter number2");
		int number2 = sc.nextInt();
		System.out.println(number1 + number2);
		System.out.println(number1 - number2);
		System.out.println(number1 * number2);
		System.out.println(number1 / number2);
		
	}

}
