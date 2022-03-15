package javaassignment;

import java.util.Scanner;

public class DisplayLargeNum {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number1");
		int number1 = sc.nextInt();
		System.out.println("Enter number2");
		int number2 = sc.nextInt();
		if(number1 > number2){
			System.out.println(number1 + " is larger");	
		}
		else if(number2 > number1) {
			System.out.println(number2 + " is larger");

		} else {
			System.out.println("These numbers are equal");
		}


	}

}
