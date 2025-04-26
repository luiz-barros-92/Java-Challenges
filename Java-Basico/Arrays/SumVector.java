import java.util.Scanner;

public class SumVector {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
		System.out.print("How many number will you type? ");
		int n = sc.nextInt();
		
		double[] vect = new double[n];
		
		for(int i=0;  i<vect.length; i++) {
		    System.out.print("Type a number: ");
		    vect[i] = sc.nextDouble();
		}
		
		System.out.print("VALUES = ");
		
		for(int i=0; i<vect.length; i++) {
		    System.out.print(vect[i] + "  ");
		}
		
		double sum = 0;
	    for(int i=0; i<vect.length; i++) {
	        sum += vect[i];
	    }
	    
	    System.out.print("\nSUM = " + sum);
	}
}
