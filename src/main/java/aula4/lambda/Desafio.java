package aula4.lambda;

import java.util.ArrayList;
import java.util.List;

/**
 * Crie uma interface funcional chamada Mostrador, que deve conter um método
 * chamado mostra que recebe uma string.
 * Na sua classe principal, crie uma lista
 * com 5 strings. 
 * Implemente a interface funcional Mostrador para que ela exiba
 * uma string em maiúsculas.
 * Utilize o forEach da lista para chamar essa função.
 */
public class Desafio {

	public static void main(String[] a) {
		List<String> lista = new ArrayList<>();
		lista.add("joão");
		lista.add("pedro");
		lista.add("java");
		lista.add("computador");
		lista.add("pedra");
		
		Mostrador m = s -> System.out.println(s.toUpperCase());

		lista.forEach(m::mostra);
	}
}
