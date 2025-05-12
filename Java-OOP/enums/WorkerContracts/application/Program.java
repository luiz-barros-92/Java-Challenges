package application;

import java.util.Scanner;
import entities.*;
import entities.enums.*;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter department's name: ");
		String department = sc.nextLine();
		Department dep = new Department(department);
		
		
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
		
		sc.close();
	}
}
