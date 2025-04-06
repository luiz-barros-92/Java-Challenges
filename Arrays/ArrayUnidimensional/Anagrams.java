package anagrams;

import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {

	public static void main(String[] args) {
		System.out.println("--Verifique se duas palavras são anagramas--");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Primeira palavra: ");
		String entrada1 = sc.nextLine().toLowerCase().trim();
		String[] fracionado1 = entrada1.split("");
				
		System.out.print("Segunda palavra: ");
		String entrada2 = sc.nextLine().toLowerCase().trim();
		String[] fracionado2 = entrada2.split("");
		
		sc.close();
		
		Arrays.sort(fracionado1);
		Arrays.sort(fracionado2);		
		
		if (Arrays.deepEquals(fracionado1, fracionado2)) {			
			System.out.println(entrada1 + " e " + entrada2 + " são anagramas!");			
		} else {			
			System.out.println(entrada1 + " e " + entrada2 + " não são anagramas!");
		}	
	}
}
