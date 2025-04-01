package numberReversal;

import java.util.Scanner;

public class NumberReversal {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Digite um número: ");
    String numero = sc.nextLine();
    String[] dividido = numero.split("");
    
    sc.close();
    
    System.out.print("O numero " + numero + " invertido fica: ");
    
    for(int c = dividido.length - 1; c >= 0; c--){
        System.out.print(dividido[c]);
    }
  }
}
