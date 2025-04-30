package sandBox;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many values will have the vector? ");
		int n = sc.nextInt();
		
		Person[] vect = new Person[n];
		
		for(int i=0; i<vect.length; i++){
		    sc.nextLine();
		    System.out.println("Data from person number " + (i + 1) + ":");
		    
		    System.out.print("Name: ");
		    String name = sc.nextLine();
		    
		    System.out.print("Age: ");
		    int age = sc.nextInt();
		    
		    vect[i] = new Person(name, age);
		}
		
		int older = 0;
		String olderName = "";
		for(int i=0; i<vect.length; i++){
			if(vect[i].getAge() > older) {
				older = vect[i].getAge();
				olderName = vect[i].getName();
			}
		}
		
		System.out.println("OLDER PERSON: " + olderName);
	
		sc.close();
	}
}
