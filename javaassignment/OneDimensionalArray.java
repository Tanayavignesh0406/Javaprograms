package javaassignment;

public class OneDimensionalArray {
	public static void main(String args[]) {
		int array[] = new int[10];
		int bonus[] = new int[15];
		
		for(int i=0;i<15;i++) {
			bonus[i]+=1;
		}   
		
		int bestScores[]= {25,30,42,70,21};
		
		for (int j=0;j<5;j++) {
			System.out.printf("%d\t",bestScores[j]);
		}
	}
	
}
