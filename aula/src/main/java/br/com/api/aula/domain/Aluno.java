package br.com.api.aula.domain;

public class Aluno {

	private Long matricula;
	private String nome;
	private String telefone;
	private Boolean isAtivo;

	public Aluno() {

	}

	public Aluno(Long matricula, String nome, String telefone, Boolean isAtivo) {
		this.matricula = matricula;
		this.nome = nome;
		this.telefone = telefone;
		this.isAtivo = isAtivo;
	}

	public Boolean getIsAtivo() {
		return isAtivo;
	}
	
	public Long getMatricula() {
		return matricula;
	}

	public void setMatricula(Long matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}
	
	public Boolean setIsAtivo(Boolean isAtivo) {
		return this.isAtivo = isAtivo;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

}