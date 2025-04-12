package clinicaMedica;

public class Main {

	public static void main(String[] args) {		
		Paciente joao = new Paciente("João");
		Paciente marcelo = new Paciente("Marcelo");
		Medico adalberto = new Medico("Adalberto");
		Medico humberto = new Medico("Humberto");
		
		Consulta c1 = new Consulta("20/11/2020", "10:25", adalberto, joao);
		c1.adicionarObservador(adalberto);
		c1.adicionarObservador(joao);
		
		c1.agendarConsulta();		
		c1.atualizarConsulta("22/11/2020", "10:35");
		
		Consulta c2 = new Consulta("23/11/2025", "11:00", humberto, marcelo);
		c2.adicionarObservador(humberto);
		c2.adicionarObservador(marcelo);
		
		c2.agendarConsulta();
		c2.atualizarConsulta("25/11/2025", "9:00");
	}
}
