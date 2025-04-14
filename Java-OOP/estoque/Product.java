package estoque;

public class Product {
	private String name;
	private double price;
	private int quantity;
	
	public Product(String name, double price, int quantity) {
		super();
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
	
	public double TotalValueInStock() {
		double totalValue = this.getQuantity();
		System.out.println("----" + this.getName() + "----");
	    System.out.println("Estoque total: " + totalValue + " un.");
	    return totalValue;
	}
	
	public void addProducts(int quantity) {
	    this.quantity += quantity;
	}
	
	public void removeProducts(int quantity) {
	    this.quantity -= quantity;
	}	
}
