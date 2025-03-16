package clinicaMedica;

public class Medico implements Observer{
	private String nome;

	public Medico(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	@Override
	public void update(String mensagem) {
		System.out.println("Médico " + nome + " recebeu a notificação: " + mensagem);
	}	
}
