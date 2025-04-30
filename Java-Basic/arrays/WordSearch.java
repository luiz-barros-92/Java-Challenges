package wordSearch;

import java.util.Scanner;

public class WordSearch {

	public static void main(String[] args) {
		String texto = "Texto de exemplo para fazer a procura de palavras";
		
		System.out.print("Buscar no texto: ");
		Scanner busca = new Scanner(System.in);
		
		String input = busca.nextLine();
		
		busca.close();
		
		if (texto.contains(input)) {
			System.out.println("Termo '" + input + "' ecnontrado no texto!");
		} else {
			System.out.println("Termo '" + input + "' não encontrado no texto!");
		}
	}
}
