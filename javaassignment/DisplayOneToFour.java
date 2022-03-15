package javaassignment;

public class DisplayOneToFour {
	public static void main(String args[]) {
		System.out.println("1 2 3 4");
		
		for(int i = 1; i <= 4; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		for(int i = 1; i <= 4; i++) {
			System.out.printf("%d ", i);
		}

	}

}
