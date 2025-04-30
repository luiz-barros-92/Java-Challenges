package estoque;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter product data: ");
		
		System.out.print("Name: ");
		String name = sc.nextLine();
		
		System.out.print("Price: ");
		double price = sc.nextDouble();
		
		System.out.print("Quantity in stock: ");
		int qty = sc.nextInt();
		
		Product p1 = new Product(name, price, qty);
		
		p1.totalValueInStock();
		
		System.out.print("Enter the number of products to be added in stock: ");
		int add = sc.nextInt();
		
		p1.addProducts(add);
		
		System.out.print("Enter the number of products to be removed from stock: ");
		int rmv = sc.nextInt();
		
		p1.removeProducts(rmv);
		
		
		sc.close();
		
	}
}