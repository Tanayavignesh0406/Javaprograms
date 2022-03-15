package javaassignment;

import java.util.Scanner;

public class MultipleOfSecond{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the integer1");
		int integer1 = sc.nextInt();
		System.out.println("Enter the integer2");
		int integer2 = sc.nextInt();
		if(integer2 % integer1 != 0){
			System.out.println(integer1 + " is a multiple of " + integer2);
		}
		else {
			System.out.println(integer1 + " is not a multiple of " + integer2);
		}
		
		
		
	}

}
