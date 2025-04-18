package estoque;

public class Product {
	private String name;
	private double price;
	private int quantity;
	
	public Product(String name, double price, int quantity) {		
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	private void printProductData(String message) {
		double total = this.getPrice() * this.getQuantity();
		System.out.printf("%s: %s, $ %.2f, %d units, Total: $ %.2f%n", message, this.getName(), this.getPrice(), this.getQuantity(), total);
	}
	
	public double totalValueInStock() {
		printProductData("Product data");		
		return this.getPrice() * this.getQuantity();
	}
	
	public void addProducts(int quantity) {
		this.quantity += quantity;
		printProductData("Updated data");
	}
	
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
		printProductData("Updated data");
	}
}
