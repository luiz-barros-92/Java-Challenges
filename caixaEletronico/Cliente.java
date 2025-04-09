package caixaEletronico;

public class Cliente {
	private String nome;
	private String conta;
    private String senha;
    private double saldo;

    public Cliente(String nome, String conta, String senha, double saldo) {
    	this.nome = nome;
        this.conta = conta;
        this.senha = senha;
        this.saldo = saldo;
    }    

    public String getNome() {
		return nome;
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
    
    public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
    
    public void depositar(double valor) {
	    this.setSaldo(this.getSaldo() + valor);
	}
	
	public void sacar(double valor) {
	    if (this.getSaldo() >= valor){
	        this.setSaldo(this.getSaldo() - valor);
	    } else {
	        System.out.println("Saldo indisponível");
	    }
	}
}

