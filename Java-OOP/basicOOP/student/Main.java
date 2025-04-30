import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	        
	        System.out.println("---Sistema do ColégioLB---");
	        
	        System.out.print("Nome do aluno: ");
	        String name = sc.nextLine();
	
	        System.out.print("M1: ");
	        double m1 = sc.nextDouble();
	
	        System.out.print("M2: ");
	        double m2 = sc.nextDouble();
	
	        System.out.print("M3: ");
	        double m3 = sc.nextDouble();
	
	        Student st = new Student(name, m1, m2, m3);
	
	        st.output();
	        
	        sc.close();
    	}
}
