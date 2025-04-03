package caixaEletronico;

public class Main {

	public static void main(String[] args) {		
		Cliente c1 = new Cliente("123", "456", 1000.00);
		System.out.println(c1.getSaldo());
		System.out.println(c1.getSenha());
		System.out.println(c1.getConta());
	}
}
