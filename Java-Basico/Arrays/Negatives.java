package negativos;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many numbers will you type? ");
		int n = sc.nextInt();
		
		int[] vect = new int[n];
		
		for (int c = 0; c < vect.length; c++) {
			System.out.print("Type a number: ");
			vect[c] = sc.nextInt();			
		}
		
		System.out.println("Negative numbers: ");
		for (int d = 0; d < vect.length; d++) {
			if (vect[d] < 0) {
				System.out.println(vect[d]);
			}
		}		
		sc.close();
	}
}
