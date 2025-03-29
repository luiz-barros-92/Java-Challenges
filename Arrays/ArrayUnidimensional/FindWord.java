package findWord;

import java.util.Scanner;

public class FindWord {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite uma frase: ");		
		String entrada = sc.nextLine();		
		String[] fracionado = entrada.split(" ");		
		
		System.out.print("Mostrar a palavra nº: ");				
		int numero = sc.nextInt() - 1;	
		
		sc.close();
		
		if(numero >= 0 && numero < fracionado.length) {
			System.out.println("A palavra nº " + (numero + 1) + " é: " + fracionado[numero]);
		} else {
			System.out.println("A frase possui " + fracionado.length + " palavras! Digite um número entre 1 e " + fracionado.length);
		}		
	}
}
