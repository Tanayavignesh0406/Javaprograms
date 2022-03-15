package javaassignment;

import java.text.DecimalFormat;
import java.util.Scanner;

public class GradeIntegers{
	public static String average(int sum, int length) {
		DecimalFormat df=new DecimalFormat("#.##");  
		String avg = df.format(sum / (double)length);
		return avg;
	}
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int array[] = new int[20];
		int i = 0;
		System.out.println("Enter the numbers: ");
		
		for(i=0; i<20; i++){
			
			int number = sc.nextInt();
			if(number == -1) {
				break;
			}
			array[i] = number;	
		}
		
		
		int sum = 0;
		for(int j = 0; j < i; j++){
			sum += array[j];
		}
		
		String avg = average(sum, i);
		System.out.println(avg);
	}

}
