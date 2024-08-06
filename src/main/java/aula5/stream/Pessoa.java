package aula5.stream;

import java.time.LocalDate;

public class Pessoa {

	private String nome;
	private String telefone;
	private LocalDate dataNascimento;

	public Pessoa(String nome, String telefone, LocalDate dataNascimento) {
		this.nome = nome;
		this.telefone = telefone;
		this.dataNascimento = dataNascimento;
	}

	public String getNome() {
		return nome;
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

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	@Override
	public String toString() {
		return String.format("Pessoa [nome=%s, telefone=%s, dataNascimento=%s]", nome, telefone, dataNascimento);
	}

	
}
