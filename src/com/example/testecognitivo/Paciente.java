package com.example.testecognitivo;

public class Paciente {
	private long id;
	private String nome;
	private String sexo;
	private String dataNasc;
	private String escolaridade;
	private String naturalidade;
	private String nacionalidade;
	
	public Paciente() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Paciente(long id, String nome, String sexo, String dataNasc,
			String escolaridade, String naturalidade, String nacionalidade) {
		super();
		this.id = id;
		this.nome = nome;
		this.sexo = sexo;
		this.dataNasc = dataNasc;
		this.escolaridade = escolaridade;
		this.naturalidade = naturalidade;
		this.nacionalidade = nacionalidade;
	}


	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getDataNasc() {
		return dataNasc;
	}
	public void setDataNasc(String dataNasc) {
		this.dataNasc = dataNasc;
	}
	public String getEscolaridade() {
		return escolaridade;
	}
	public void setEscolaridade(String escolaridade) {
		this.escolaridade = escolaridade;
	}
	public String getNaturalidade() {
		return naturalidade;
	}
	public void setNaturalidade(String naturalidade) {
		this.naturalidade = naturalidade;
	}
	public String getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	
	
}
