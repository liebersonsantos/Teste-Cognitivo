package com.example.testecognitivo;

public class Teste {
	private long id;
	private long idPaciente;
	private long idMedico;
	private String resultado;
	
	public Teste() {
		// TODO Auto-generated constructor stub
	}

	public Teste(long id, long idPaciente, long idMedico, String resultado) {
		super();
		this.id = id;
		this.idPaciente = idPaciente;
		this.idMedico = idMedico;
		this.resultado = resultado;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getIdPaciente() {
		return idPaciente;
	}

	public void setIdPaciente(long idPaciente) {
		this.idPaciente = idPaciente;
	}

	public long getIdMedico() {
		return idMedico;
	}

	public void setIdMedico(long idMedico) {
		this.idMedico = idMedico;
	}

	public String getResultado() {
		return resultado;
	}

	public void setResultado(String resultado) {
		this.resultado = resultado;
	}
	
	
	
}
