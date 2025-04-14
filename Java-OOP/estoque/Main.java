package estoque;

public class Main {

	public static void main(String[] args) {
		Product p1 = new Product("Alcool", 25.0, 1);		
		
		p1.addProducts(5);
		p1.removeProducts(6);
		p1.TotalValueInStock();
	}
}