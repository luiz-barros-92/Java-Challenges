package rectangle;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter rectangle width and height: ");
		
		System.out.print("Width = ");
		double width = sc.nextDouble();
		
		System.out.print("Height = ");
		double height = sc.nextDouble();
		
		Rectangle rectangle = new Rectangle(width, height);
		rectangle.printResults();
		
		sc.close();
	}
}
