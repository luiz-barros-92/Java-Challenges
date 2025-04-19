package salary;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.print("Name: ");
	    String name = sc.nextLine();
	    
	    System.out.print("Gross Salary: ");
	    double gross = sc.nextDouble();
	    
	    System.out.print("Tax: ");
	    double tx = sc.nextDouble();
	    
	    Employee emp = new Employee(name, gross, tx);
	    
	    emp.printNameAndSalary("Employee: ");
	    
	    System.out.print("Wich percentage to increase salary? ");
	    double prc = sc.nextDouble();
	    
	    emp.increaseSalary(prc);	    
	    
	    sc.close();
	}
}