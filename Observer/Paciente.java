package clinicaMedica;

public class Paciente implements Observer{
	private String nome;

	public Paciente(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}

	@Override
	public void update(String mensagem) {
		System.out.println("Paciente " + nome + " recebeu a notificação: " + mensagem);
	}	
}
