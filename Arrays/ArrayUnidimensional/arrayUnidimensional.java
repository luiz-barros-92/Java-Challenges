package arrayUnidimencional;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int [] num = new int[5];
		
		System.out.println("---Digitando 5 valores---");
		
		Scanner valores = new Scanner(System.in);
		
		for (int c = 0; c < 5; c++) {			
			System.out.print("Digite o " + (c + 1) + "º valor: ");	
			
			num[c] = valores.nextInt();			
		}
		
		valores.close();		
		
		int soma = num[0] + num[1] + num[2] + num[3] + num[4];
		
		System.out.println("A soma de " + num[0] + " + " + num[1] + " + " + num[2] + " + " + num[3] + " + " + num[4] + " é igual a " + soma + ".");
	}
}
