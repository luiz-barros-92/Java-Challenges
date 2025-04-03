package caixaEletronico;

public class Cliente {		
	private String conta;
    private String senha;
    private double saldo;

    public Cliente(String conta, String senha, double saldo) {
        this.conta = conta;
        this.senha = senha;
        this.saldo = saldo;
    }

    public String getConta() {
        return conta;
    }

    public String getSenha() {
        return senha;
    }

    public double getSaldo() {
        return saldo;
    }
}

