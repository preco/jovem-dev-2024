package aula2.poo.exercicio6;

import java.time.LocalDate;

/**
 * Crie uma classe Pessoa, com os atributos "nome" e "dataNascimento". Em
 * seguida, crie outra classe chamada PessoaFisica, que deve herdar as
 * características de Pessoa e adicionar o atributo "cpf". Na classe principal,
 * crie 1 Pessoa e 1 PessoaFisica e imprima os atributos da pessoa mais nova.
 */
public class Principal {

	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa("Thiago", LocalDate.of(1984, 6, 28));
		PessoaFisica pessoa2 = new PessoaFisica("Pessoa", LocalDate.of(1999, 5, 25), "12345657890");
		
		imprimeMaisNova(pessoa1, pessoa2);

	}

	private static void imprimeMaisNova(Pessoa pessoa1, PessoaFisica pessoa2) {
		if (pessoa1.getDataNascimento().isAfter(pessoa2.getDataNascimento())) {
			System.out.println(pessoa1);
		} else if (pessoa2.getDataNascimento().isAfter(pessoa1.getDataNascimento())) {
			System.out.println(pessoa2);
		} else {
			System.out.println("As duas pessoas nasceram no mesmo dia!");
			System.out.println(pessoa1);
			System.out.println(pessoa2);
		}
	}

}
