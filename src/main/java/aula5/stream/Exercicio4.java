package aula5.stream;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Crie uma classe chamada Pessoa contendo nome, telefone e data de nascimento.
 * A seguir, crie uma lista com 10 pessoas e mostre todas as pessoas que
 * nascidas em maio, ordenadas por nome
 */
public class Exercicio4 {

	public static void main(String[] args) {
		List<Pessoa> pessoas = new ArrayList<>();
		pessoas.add(new Pessoa("Ana", "48 9999-1111", LocalDate.of(1998, 5, 1)));
        pessoas.add(new Pessoa("Bruno", "48 9999-2222", LocalDate.of(1997, 6, 2)));
        pessoas.add(new Pessoa("Carlos", "48 9999-3333", LocalDate.of(1996, 5, 3)));
        pessoas.add(new Pessoa("Daniela", "48 9999-4444", LocalDate.of(1995, 7, 4)));
        pessoas.add(new Pessoa("Eduardo", "48 9999-5555", LocalDate.of(1994, 5, 5)));
        pessoas.add(new Pessoa("Fernanda", "48 9999-6666", LocalDate.of(1993, 8, 6)));
        pessoas.add(new Pessoa("Gabriel", "48 9999-7777", LocalDate.of(1992, 9, 7)));
        pessoas.add(new Pessoa("Helena", "48 9999-8888", LocalDate.of(1991, 10, 8)));
        pessoas.add(new Pessoa("Igor", "48 9999-9999", LocalDate.of(1990, 11, 9)));
        pessoas.add(new Pessoa("Juliana", "48 9999-1010", LocalDate.of(1989, 12, 10)));
        
        pessoas.stream()
        	.filter(p -> p.getDataNascimento().getMonth() == Month.MAY)
        	.sorted(Comparator.comparing(Pessoa::getNome))
        	.forEach(System.out::println);
	}

}
