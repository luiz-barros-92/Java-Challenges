package buyingDollars;

public class CurrencyConverter {
	
	public static final double IOF = 0.06;
	
	public static double calculateAmount(double price, double bought) {
		return (price * bought) + (price * bought) * IOF;
	}
}

