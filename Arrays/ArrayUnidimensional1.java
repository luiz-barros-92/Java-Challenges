package arrayUnidimencional;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayUnidimensional {

	public static void main(String[] args) {
		int [] num = new int[5];
		
		System.out.println("---Digitando 5 valores---");
		
		Scanner valores = new Scanner(System.in);
		
		for (int c = 0; c < num.length; c++) {			
			System.out.print("Digite o " + (c + 1) + "º valor: ");				
			num[c] = valores.nextInt();
		}
		
		valores.close();
		
		int soma = 0;
		for (int i = 0; i < num.length; i++) {			
			soma += num[i];
		}
				
		System.out.println("A soma de " + Arrays.toString(num) + " é igual a " + soma + ".");
	}
}
