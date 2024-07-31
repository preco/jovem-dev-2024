package aula2.poo.exercicio6;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Pessoa {
	private String nome;
	private LocalDate dataNascimento;
	
	public Pessoa(String nome, LocalDate dataNascimento) {
		this.nome = nome;
		this.dataNascimento = dataNascimento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	@Override
	public String toString() {
		String dataFormatada = dataNascimento.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		return "Nome: " + nome + ", Data de nascimento: " + dataFormatada;
	}
	
}
