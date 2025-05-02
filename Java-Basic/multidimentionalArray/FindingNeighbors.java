package sandBox;

import java.util.Scanner;

public class FindingNeighbors {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("V1:");		
		int m = sc.nextInt();
		
		System.out.print("V2:");
		int n = sc.nextInt();
		
		int [][] vect = new int [m][n];
		
		System.out.println("Typing the values of the matrix " + m + " x " + n + ":");		
		for (int i=0; i<vect.length; i++) {
			for (int j=0; j<vect[i].length; j++) {
				vect[i][j] = sc.nextInt();
			}
		}		
		
		System.out.print("Search number: ");
		int search = sc.nextInt();
		
		for (int i=0; i<vect.length; i++) {
			for (int j=0; j<vect[i].length; j++) {
				if (vect[i][j] == search) {
					System.out.println("Position " + i + "," + j);					
					if ((j - 1) >= 0){
						System.out.println("Left: " + vect[i][j - 1]);
					}
					if ((j + 1) < vect[i].length) {
						System.out.println("Right: " + vect[i][j + 1]);
					}
					if ((i - 1) >= 0) {
						System.out.println("Up: " + vect[i - 1][j]);
					}
					if ((i + 1) < vect.length){
						System.out.println("Down: " + vect[i + 1][j]);	
						}					
				}
			}
		}		
				
		sc.close();

	}

}
