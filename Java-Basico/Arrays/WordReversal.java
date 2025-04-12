package wordReversal;

public class Main {

	public static void main(String[] args) {
		String frase = "Dog bites man";
		String[] palavras = frase.split(" ");
		
		System.out.println(palavras[2] + " " + palavras[1] + " " + palavras[0]);		
	}
}
