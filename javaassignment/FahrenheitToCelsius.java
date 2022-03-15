package javaassignment;

import java.util.Scanner;

public class FahrenheitToCelsius {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Fahrenheit degree:");
		int fahrenheit = sc.nextInt();
		double celcius = (fahrenheit - 32)*(5.0/9.0);
		System.out.println(celcius);

	}

}
