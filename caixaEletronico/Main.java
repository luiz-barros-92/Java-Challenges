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
		
		Cliente cliente = caixa.getCliente(conta);
		
		if (cliente != null && cliente.getSenha().equals(senha)) {
			System.out.println("Bem vindo(a) à sua conta, " + cliente.getNome() + "!\n");
			System.out.println("------Menu------");
			
			int acao;
			
			do {
				System.out.println("\n[1]Depositar\n[2]Sacar\n[3]Verificar o Saldo\n[0]Sair");
				System.out.print("\nQual ação deseja executar? ");				
				
				acao = sc.nextInt();				
				
				switch (acao) {
					case 1:
						 System.out.print("Qual valor você deseja depositar? R$");
					     double deposito = sc.nextDouble();
					     cliente.depositar(deposito);					     
					     break;
					case 2:
						System.out.println("Qual valor você deseja sacar? R$");
						double saque = sc.nextDouble();
						cliente.sacar(saque);												
						break;
					case 3:
						//TODO construir um status para classe cliente (saldo)
					default:
		                System.out.println("Opção inválida. Tente novamente.");
				}
				
			} while (acao != 0);			
			
			sc.close();
			
		} else {
			System.out.println("Acesso Negado!");
		}		
	}
}
