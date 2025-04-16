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
	
	public double totalValueInStock() {
		double sum = this.getPrice() * this.getQuantity();
		System.out.printf("Product data: %s, $ %.2f, %d units, Total: $ %.2f%n", this.getName(), this.getPrice(), this.getQuantity(), sum);
		return sum;
	}
	public void addProducts(int quantity) {
		this.quantity += quantity;
		double sum = this.getPrice() * this.getQuantity();
		System.out.printf("Updated data: %s, $ %.2f, %d units, Total: $ %.2f%n", this.getName(), this.getPrice(), this.getQuantity(), sum);
	}
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
		double sum = this.getPrice() * this.getQuantity();
		System.out.printf("Updated data: %s, $ %.2f, %d units, Total: $ %.2f%n", this.getName(), this.getPrice(), this.getQuantity(), sum);
	}
}
