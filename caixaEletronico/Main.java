package caixaEletronico;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {		
		System.out.println("----Bem vindo ao LuizBank!----");
		System.out.println("------Acesse sua conta:-------");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Conta: ");
		String conta = sc.nextLine();
		
		System.out.print("Senha: ");
		String senha = sc.nextLine();
		
		sc.close();		
		
	}
}
