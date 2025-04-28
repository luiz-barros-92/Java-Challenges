import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many persons will be registered? ");
		int n = sc.nextInt();
		
		Person[] vect = new Person[n];		
		
		for(int i=0; i<vect.length; i++){		    
		    System.out.println("Data of the person number" + (i + 1) + ":");
		    sc.nextLine();
		    
		    System.out.print("Height: ");
		    double height = sc.nextDouble();
		    
		    System.out.print("Gender: ");
		    char gender = sc.next().charAt(0);
		    
		    vect[i] = new Person(height, gender);
		}		
		
		double lower = vect[0].getHeight();
		double higher = vect[0].getHeight();
		double womanHeight = 0;
        int womanCount = 0;
		int male = 0;
		
		for(int i=0; i<vect.length; i++){
			if(vect[i].getHeight() < lower) {
			    lower = vect[i].getHeight();
			}
		}
		System.out.printf("LOWER HEIGHT = %.2f%n", lower);
		
		for(int i=0; i<vect.length; i++){
			if(vect[i].getHeight() > higher) {
			    higher = vect[i].getHeight();
			}
		}
		System.out.printf("HIGHER HEIGHT = %.2f%n", higher);
		
		for(int i=0; i<vect.length; i++){
			if(vect[i].getGender() == 'F') {
			    womanHeight += vect[i].getHeight();
                womanCount++;
			}
		}

        double avgWomanHeight = womanHeight / womanCount;
		
		System.out.printf("AVERAGE WOMAN HEIGHT = %.2f%n", avgWomanHeight);
		
		for(int i=0; i<vect.length; i++){
			if(vect[i].getGender() == 'M') {
			    male++;
			}
		}
		System.out.println("MEN NUMBER " + male);
	
		sc.close();
	}
}