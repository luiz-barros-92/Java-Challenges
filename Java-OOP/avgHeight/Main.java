import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
		System.out.print("How many persons will be typed? ");
		int n = sc.nextInt();
		
		Person[] vect = new Person[n];
		
		for(int i=0; i<vect.length; i++){
		    sc.nextLine();
		    System.out.println("Data from person number " + (i + 1) + ":");
		    
		    System.out.print("Name: ");
		    String name = sc.nextLine();
		    
		    System.out.print("Age: ");
		    int age = sc.nextInt();
		    
		    System.out.print("Height: ");
		    double height = sc.nextDouble();
		    
		    vect[i] = new Person(name, age, height);
		}
		
		double sumHeight = 0.0;
		for(int i=0; i<vect.length; i++){
		    sumHeight += vect[i].getHeight();
		}
		
		double avg = sumHeight / vect.length;
		
		System.out.printf("\nAverage height: %.2f%n", avg);
		
		double lessThan16 = 0;
		for(int i=0; i<vect.length; i++){
		    if(vect[i].getAge() < 16){
		        lessThan16++;
		    }
		}
		
		double percentage = (lessThan16 * 100) / vect.length;
		System.out.println("Persons with less than 16 years: " + percentage + "%");
		
		for(int i=0; i<vect.length; i++){
		    if(vect[i].getAge() < 16){
		        System.out.println(vect[i].getName());
		    }
		}
		
		sc.close();
	}
}