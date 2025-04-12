package vowelsAndConsonants;

import java.util.Scanner;

public class VowelsConsonants {
	public static void main(String[] args) {
	    String[] vogais = {"a", "e", "i", "o", "u"};
	    String[] consoantes = {"b", "c", "d", "f", "g", "h", "j", "k", "l", "m", "n", "p", "q", "r", "s", "t", "v", "w", "x", "y", "z"};
	    
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Digite uma frase: ");
	    String frase = sc.nextLine().toLowerCase();
	    sc.close();
	    
	    String[] fraseFracionada = frase.split("");
		
		int totalVogais = 0;
		int totalConsoantes = 0;
		
		for (int c = 0; c < fraseFracionada.length; c++){
			for (int d = 0; d < vogais.length; d++) {
				 if (fraseFracionada[c].contains(vogais[d])){
				    	totalVogais++;
				 }		   
		    }		    
		}
		
		for (int e = 0; e < fraseFracionada.length; e++){
			for (int f = 0; f < consoantes.length; f++) {
				 if (fraseFracionada[e].contains(consoantes[f])){
				    	totalConsoantes++;
				 }		   
		    }		    
		}
		
		System.out.println("A sua frase tem " + totalVogais + " vogais e " + totalConsoantes + " consoantes.");
	}
}