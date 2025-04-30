package sandBox;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		List<Employee> list = new ArrayList<>();

		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();

		for(int i=0; i<n; i++) {
			System.out.println("Employee # " + (i+1) + ":");

			System.out.print("Id: ");
			int id = sc.nextInt();

			System.out.print("Name: ");
			String name = sc.nextLine();

			System.out.print("Salary: ");
			double salary = sc.nextDouble();

			list.add(new Employee(id, name, salary));
		}
		
		System.out.print("Enter the employee id that will have salary increase: ");
		int idIncrease = sc.nextInt();
		
		Employee emp = list.stream().filter(x -> x.getId() == idIncrease).findFirst().orElse(null);
		
		if(emp == null) {
		    System.out.println("This id does not exist!");
		}else {
		    System.out.print("Enter the percentage: ");
		    double percentage = sc.nextDouble();
		    emp.increaseSalary(percentage);
		}

		
		//TODO  Finish the output
		sc.close();
	}
}