package javaassignment;

import java.util.Scanner;

public class LargestOfTen {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int largest = 0;
		System.out.println("Enter the input: ");
		for(int i = 0; i < 10; i++){
			int number = sc.nextInt();
			if(number > largest) {
				largest = number;
			}
			
		}
		System.out.println("The largest is " + largest);
		
	
	}

}
