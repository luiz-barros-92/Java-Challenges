package sandBox;

public class Person {
	private String name;
	private double n1;
	private double n2;
	
	public Person(String name, double n1, double n2) {
		this.name = name;
		this.n1 = n1;
		this.n2 = n2;
	}
	
	public String getName() {
		return name;
	}
	
	public double getN1() {
		return n1;
	}
	
	public double getN2() {
		return n2;
	}
	
	public double averageGrade() {
		return (this.getN1() + this.getN2()) / 2;
	}
}
