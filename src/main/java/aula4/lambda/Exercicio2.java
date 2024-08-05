package aula4.lambda;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Crie uma classe chamada Aluno, com numeroChamada, nome 
 * e dataNascimento. Em seguida, na classe Principal,
 * crie uma lista com 5 alunos e, em seguida,
 * utilize Comparator.comparing para ordenar os alunos 
 * por data de nascimento. Mostre a lista ordenada.
 */
public class Exercicio2 {

	public static void main(String[] args) {

		List<Aluno> lista = new ArrayList<>();
		lista.add(new Aluno(1, "João", LocalDate.of(1999, 1, 2)));
		lista.add(new Aluno(2, "Luiza", LocalDate.of(2002, 10, 8)));
		lista.add(new Aluno(3, "Maria", LocalDate.of(1992, 3, 30)));
		lista.add(new Aluno(4, "Norberto", LocalDate.of(1999, 10, 16)));
		lista.add(new Aluno(5, "Silvio", LocalDate.of(2000, 9, 30)));
		
		lista.sort(Comparator.comparing(Aluno::getDataNascimento));
		
		lista.forEach(System.out::println);
	}

}
