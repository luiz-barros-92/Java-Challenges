package clinicaMedica;

import java.util.ArrayList;
import java.util.List;

public class Consulta implements Subject{
	private List<Observer> observadores = new ArrayList<>();
	private String data;
	private String horario;
	private Medico medico;
	private Paciente paciente;
	
	public Consulta (String data, String horario, Medico medico, Paciente paciente) {
		this.data = data;
		this.horario = horario;
		this.medico = medico;
		this.paciente = paciente;
	}

	public String getData() {
		return data;
	}

	public String getHorario() {
		return horario;
	}

	public Medico getMedico() {
		return medico;
	}

	public Paciente getPaciente() {
		return paciente;
	}
	
	@Override
    public void adicionarObservador(Observer observer) {
        observadores.add(observer);
    }
	
	@Override
    public void removerObservador(Observer observer) {
        observadores.remove(observer);
    }
	
	@Override
    public void notificarObservadores() {
        for (Observer observer : observadores) {
            observer.update("Novo agendamento para " + paciente.getNome() + " com Dr(a). " + medico.getNome() + " no dia " + data + " às " + horario);
        }
    }
	
	public void agendarConsulta() {
		notificarObservadores();
	}
	
	public void atualizarConsulta(String data, String horario) {
		this.data = data;
		this.horario = horario;
		
		notificarObservadores();
	}
}
