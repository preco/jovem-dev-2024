package aula6.outros;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Comparator;
import java.util.stream.Stream;

import aula5.stream.Pessoa;

/**
 * Crie um objeto chamado Pessoa com nome, telefone e data de nascimento. Na
 * classe Exercicio4, peça para o usuário digitar o nome de 2 pessoas e imprima
 * os dados da pessoa mais velha. Nesse exercício, você não deve utilizar
 * concatenação de Strings (operador + ou método .concat)
 */
public class Exercicio4 {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("João", "48 9999", LocalDate.of(2002, 10, 5));
		Pessoa p2 = new Pessoa("Maria", "48 9999", LocalDate.of(2001, 10, 5));
		
		Stream.of(p1, p2)
			.sorted(Comparator.comparing(Pessoa::getDataNascimento))
			.findFirst()
				.ifPresent(Exercicio4::exibeDadosPessoa);

	}

	private static void exibeDadosPessoa(Pessoa pessoa) {
		String dataFormatada = pessoa.getDataNascimento()
				.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		System.out.println(String.format("Nome: %s; Data de nascimento: %s",
				pessoa.getNome(), dataFormatada));
	}

}
