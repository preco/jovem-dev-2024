package aula2.poo.exercicio5;

import java.time.LocalDate;

/**
 * Crie uma classe chamada Pessoa, que conterá 2 atributos: Nome e Data de
 * Nascimento, que deve ser LocalDate. Em seguida, no construtor da classe
 * principal, crie 2 pessoas com atributos diferentes. A seguir, crie um método
 * que imprima o nome e a idade da pessoa mais velha.
 */
public class Principal {

	public static void main(String[] args) {
		new Principal();
	}

	public Principal() {
		Pessoa pessoa1 = new Pessoa("Thiago", LocalDate.of(1984, 6, 28));
		Pessoa pessoa2 = new Pessoa("Samuel", LocalDate.of(2019, 9, 3));

		imprimeMaisVelha(pessoa1, pessoa2);
	}

	private void imprimeMaisVelha(Pessoa pessoa1, Pessoa pessoa2) {
		if (pessoa1.getDataNascimento().isBefore(pessoa2.getDataNascimento())) {
			System.out.println(pessoa1);
		} else if (pessoa2.getDataNascimento().isBefore(pessoa1.getDataNascimento())) {
			System.out.println(pessoa2);
		} else {
			System.out.println("As duas pessoas nasceram no mesmo dia!");
			System.out.println(pessoa1);
			System.out.println(pessoa2);
		}
	}
}
