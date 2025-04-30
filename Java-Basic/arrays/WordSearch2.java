package wordSearch2;

import java.util.Scanner;

public class WordSearch2 {

	public static void main(String[] args) {
		String frase = "Esse texto será utilizado para fazer a varredura de quantidades de texto iguais . Para tanto , o texto é esse";
		
		String [] fracionado = frase.split(" ");		
		
		System.out.print("Buscar no texto: ");
		Scanner busca = new Scanner(System.in);
		
		String pesquisa = busca.nextLine().trim();
		
		busca.close();
		
		int contador = 0;
		for (int i = 0; i < fracionado.length; i++) {
			if (pesquisa.equalsIgnoreCase(fracionado[i])) {
				contador++;
			}
		}
		
		if (contador == 1) {
			System.out.println("O termo '" + pesquisa + "' foi encontrado " + contador + " vez.");
		}else if (contador > 1) {
			System.out.println("O termo '" + pesquisa + "' foi encontrado " + contador + " vezes.");
		}else {
			System.out.println("O termo '" + pesquisa + "' não foi encontrado.");
		}
	}
}
