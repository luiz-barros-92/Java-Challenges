package biggerPosition;

import java.util.Scanner;

public class BiggerPosition {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many numbers will you type? ");
		int n = sc.nextInt();
		
		double[] vect = new double[n];
		
		for(int i=0; i < vect.length; i++) {
			System.out.print("Type a number: ");
			vect[i] = sc.nextDouble();
		}
		
		double bigger = 0;
		int position = 0;
		for(int i=0; i<vect.length; i++) {
			if(vect[i] > bigger) {
				bigger = vect[i];
				position = (i + 1);
			}
		}
		
		System.out.println("BIGGER VALUE = " + bigger);
		System.out.println("POSITION OF BIGGER VALUE = " + position);	
		
		sc.close();
	}
}
