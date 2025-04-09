package caixaEletronico;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		CaixaEletronico caixa = new CaixaEletronico();
		
		System.out.println("----Bem vindo ao LuizBank!----");
		System.out.println("------Acesse sua conta:-------");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Conta: ");
		String conta = sc.nextLine();
		
		System.out.print("Senha: ");
		String senha = sc.nextLine();
		
		sc.close();	
		
		Cliente cliente = caixa.getCliente(conta);
		
		if (cliente != null && cliente.getSenha().equals(senha)) {
			System.out.println("Bem vindo(a) à sua conta, " + cliente.getNome() + "!");			
		} else {
			System.out.println("Acesso Negado!");
		}		
	}
}
