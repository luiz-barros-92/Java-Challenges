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
	
	/*public double perimeter() {		
		//TODO calcular perimetro		
	}
	
	public double diagonal() {
		//TODO calcular diagonal
	}*/	

}
