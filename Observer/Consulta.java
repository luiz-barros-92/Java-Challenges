package clinicaMedica;

public class Consulta {
	private String data;
	private String horario;
	private String medico;
	private String paciente;
	
	public Consulta (String data, String horario, String medico, String paciente) {
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

	public String getMedico() {
		return medico;
	}

	public String getPaciente() {
		return paciente;
	}
	
	@Override
	public String toString() {
		return "Consulta{" +
                "data='" + data + '\'' +
                ", horario='" + horario + '\'' +
                ", medico='" + medico + '\'' +
                ", paciente='" + paciente + '\'' +
                '}';		
	}	
}
