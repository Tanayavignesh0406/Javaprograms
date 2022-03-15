package javaassignment;

import java.util.Scanner;

public class ThreeIntegers {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter integer1");
		int integer1 = sc.nextInt();
		System.out.println("Enter integer2");
		int integer2 = sc.nextInt();
		System.out.println("Enter integer3");
		int integer3 = sc.nextInt();
		
		int sum = integer1+integer2+integer3;
		System.out.println(sum);
		System.out.println(sum / 3);
		System.out.println(integer1*integer2*integer3);
		
		if(integer1>integer2 && integer1>integer3) {
			System.out.println(integer1 + " is larger");
		}
		
		if(integer2>integer1 && integer2>integer3) {
			System.out.println(integer2 + " is larger");
		}
		
		if(integer3>integer1 && integer3>integer2) {
			System.out.println(integer3 + " is larger");
		}
		
	}

}
