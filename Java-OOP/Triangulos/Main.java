package triangulos;

import java.util.Scanner;

public class Main {		
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("--Calculando a área do triângulo:");
		System.out.println("Digite as medidas dos lados do 1º triângulo:");
		
		System.out.print("Lado 1: ");
		float lado1 = sc.nextFloat();
		
		System.out.print("Lado 2: ");
		float lado2 = sc.nextFloat();
		
		System.out.print("Lado 3: ");
		float lado3 = sc.nextFloat();
		
	    Triangulo tr1 = new Triangulo(lado1, lado2, lado3);
	    float area1 = tr1.calcularArea();
	    
	    System.out.println("Digite as medidas dos lados do 2º triângulo:");
		
		System.out.print("Lado 1: ");
		float lado4 = sc.nextFloat();
		
		System.out.print("Lado 2: ");
		float lado5 = sc.nextFloat();
		
		System.out.print("Lado 3: ");
		float lado6 = sc.nextFloat();
		
		sc.close();
		
	    Triangulo tr2 = new Triangulo(lado4, lado5, lado6);
	    float area2 = tr2.calcularArea();  
	    
		System.out.println("Área do 1º: " + area1);
		System.out.println("Área do 2º: " + area2);
		
		if(area1 > area2) {
			System.out.println("Maior área: 1º");
		} else {
			System.out.println("Maior área: 2º");
		}
	}
}
