package findWord;

import java.util.Scanner;

public class FindWord {

	public static void main(String[] args) {
		System.out.print("Digite uma frase: ");		
		Scanner frase = new Scanner(System.in);
		String entrada = frase.nextLine();
		
		String[] fracionado = entrada.split(" ");		
		
		System.out.print("Mostrar a palavra nº: ");		
		Scanner escolha = new Scanner(System.in);		
		int numero = escolha.nextInt() - 1;
		
		if(numero >= 0 && numero < fracionado.length) {
			System.out.println("A palavra nº " + (numero + 1) + " é: " + fracionado[numero]);
		} else {
			System.out.println("A frase possui " + fracionado.length + " palavras! Digite um número entre 1 e " + fracionado.length);
		}	
		
		frase.close();
		escolha.close();
	}
}
