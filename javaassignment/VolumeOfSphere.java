package javaassignment;

import java.util.Scanner;

public class VolumeOfSphere {
	public static void sphereVolume(double radius) {
		double volume = (4.0/3.0)*(3.14)*(radius*radius*radius);
		System.out.println("Volume of Sphere " + volume);
	}
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius of sphere :");
		double radius = sc.nextDouble();
		
		
		sphereVolume(radius);
	}

}
