package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;
import entities.*;
import entities.enums.*;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter department's name: ");
		String department = sc.nextLine();
		Department dep = new Department(department);
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");		
		
		System.out.println("Enter worker data:");
		
		System.out.print("Name: ");
		String wName = sc.nextLine();			
		
		WorkerLevel wLevel = null;		
		while (wLevel == null) {
			System.out.print("Level: ");		
			String level = sc.nextLine().trim().toUpperCase();
			try {
				wLevel = WorkerLevel.valueOf(level);
			} catch (IllegalArgumentException e ) {
				System.out.println("Invalid level! Please, insert JUNIOR, MID_LEVEL or SENIOR");
			}
		}		
		
		System.out.print("Base salary: ");
		Double baseSalary = sc.nextDouble();		
		
		Worker worker = new Worker(wName, wLevel, baseSalary, dep);
		
		System.out.print("How many contracts to this worker? ");
		int contracts = sc.nextInt();
		sc.nextLine();
		
		for(int i=0; i<contracts; i++) {
			System.out.println("Enter the contract #" + (i+1) +":");
			
			LocalDate date1 = null;
			while(date1 == null) {
				System.out.print("Date (DD/MM/YY): ");
				String date = sc.nextLine();
				try {
					date1 = LocalDate.parse(date, format);
				} catch (DateTimeParseException e){
					System.out.println("Invalid format. Use DD/MM/YYY:");
				}
			}
			
			System.out.print("Value per hour: ");
			Double valuePerHour = sc.nextDouble();
			sc.nextLine();	
			
			System.out.print("Duration (hours): ");
			Integer hours = sc.nextInt();
			sc.nextLine();
			
			HourContract hourContract = new HourContract(date1, valuePerHour, hours);
			worker.addContract(hourContract);
		}
		
		System.out.print("Enter month and year to calculate income(MM/YYYY): ");
		String incomeDate = sc.next();
		int month = Integer.parseInt(incomeDate.substring(0, 2));
		int year = Integer.parseInt(incomeDate.substring(3));
		Double income = worker.income(year, month);
		
		System.out.println("Name: " + worker.getName());
		System.out.println("Department: " + worker.getDepartment().getName());
		System.out.println("Income for " + incomeDate + ": " + income);
				
		sc.close();
	}
}
