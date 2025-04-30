package rectangle;

public class Rectangle {
	private double width;
	private double height;
	
	public Rectangle(double width, double height) {		
		this.width = width;
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public double getHeight() {
		return height;
	}
	
	public double area() {
		double area = this.width * this.height;
		return area;
	}
	
	public double perimeter() {		
		double perimeter = 2 * (this.width + this.height);
		return perimeter;
	}
	
	public double diagonal() {
		double diagonal = Math.sqrt(Math.pow(this.width, 2) + (Math.pow(this.height, 2)));
		return diagonal;
	}
	
	public void printResults() {
		System.out.printf("AREA = %.2f%n"
				+ "PERIMETER = %.2f%n"
				+ "DIAGONAL = %.2f", 
				area(), perimeter(), diagonal());
	}
}
