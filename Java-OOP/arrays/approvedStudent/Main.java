package sandBox;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many students will be registered? ");
		int n = sc.nextInt();
		
		Person[] vect = new Person[n];		
		
		for(int i=0; i<vect.length; i++){		    
		    System.out.println("Data of the student number" + (i + 1) + ":");
		    sc.nextLine();
		    System.out.print("Name: ");
		    String name = sc.nextLine();
		    
		    System.out.print("N1: ");
		    double n1 = sc.nextDouble();
		    
		    System.out.print("N2: ");
		    double n2 = sc.nextDouble();
		    
		    vect[i] = new Person(name, n1, n2);
		}		
		
		System.out.println("APPROVED STUDENTS:");
		for(int i=0; i<vect.length; i++){
			if(vect[i].averageGrade() >= 6.0) {
				System.out.println(vect[i].getName());
			}
		}
	
		sc.close();
	}
}
