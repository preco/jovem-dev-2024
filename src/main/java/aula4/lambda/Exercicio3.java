package aula4.lambda;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Crie uma lista com 5 alunos e, em seguida,
 * remova da lista todos os alunos
 * cujo nome começa com a letra T e termine com a letra O.
 */
public class Exercicio3 {

	public static void main(String[] args) {

		List<Aluno> lista = new ArrayList<>();
		lista.add(new Aluno(1, "João", LocalDate.of(1999, 1, 2)));
		lista.add(new Aluno(2, "Luiza", LocalDate.of(2002, 10, 8)));
		lista.add(new Aluno(3, "Norberto", LocalDate.of(1999, 10, 16)));
		lista.add(new Aluno(4, "Teobaldo", LocalDate.of(1999, 10, 16)));
		lista.add(new Aluno(5, "Thiago", LocalDate.of(2000, 9, 30)));

		lista.removeIf(aluno -> aluno.getNome().startsWith("T") 
				&& aluno.getNome().endsWith("o"));

		lista.forEach(System.out::println);
	}

}
