package buyingDollars;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is the dollar price? ");
		double dollarPrice = sc.nextDouble();
		
		System.out.print("How many dollars will be bought? ");
		double bought = sc.nextDouble();
		
		double amount = CurrencyConverter.calculateAmount(dollarPrice, bought);
		
		System.out.printf("Amount to be paid in reais = %.2f", amount);
		
		sc.close();
	}
}
