package aula4.lambda;

import java.time.LocalDate;

public class Aluno {

	private Integer numeroChamada;
	private String nome;
	private LocalDate dataNascimento;
	
	
	public Aluno(Integer numeroChamada, String nome, LocalDate dataNascimento) {
		this.numeroChamada = numeroChamada;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
	}
	
	public Integer getNumeroChamada() {
		return numeroChamada;
	}
	public void setNumeroChamada(Integer numeroChamada) {
		this.numeroChamada = numeroChamada;
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
		return String.format("Aluno [numeroChamada=%s, nome=%s, dataNascimento=%s]", numeroChamada, nome,
				dataNascimento);
	}
	
	
}
