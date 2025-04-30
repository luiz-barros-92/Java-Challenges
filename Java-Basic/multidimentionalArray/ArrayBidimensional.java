package arrayBidimensional;

import java.util.Scanner;

public class ArrayBidimensional {

	public static void main(String[] args) {
		int [][] matriz = new int [3][3];
		
		System.out.println("----Inserindo 3 valores em 3 linhas----");
		
		 Scanner valores = new Scanner(System.in);
		
		for (int i = 0 ; i < matriz.length; i++) {
			System.out.println("Linha " + (i + 1));
			
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print("Valor " + (j + 1) + ": ");
				
				matriz[i][j] = valores.nextInt();
			}			
		}
		
		valores.close();
		
		System.out.println("---Matriz no formato tabular---");
				
		for (int c = 0; c < matriz.length; c++) {
			for (int d = 0; d < matriz[c].length; d++) {
				System.out.print(matriz[c][d] + " ");
			}
			System.out.println();			
		}
		
		int soma = 0;
			for (int e = 0; e < matriz.length; e++) {
				for (int f = 0; f < matriz[e].length; f++) {
					soma += matriz[e][f];
				}
			}
		System.out.println("Soma dos elementos da matriz = " + soma);

	}
}
