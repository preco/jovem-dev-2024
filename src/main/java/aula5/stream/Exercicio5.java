package aula5.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import aula5.stream.exceptions.ZeroBertoException;

/**
 * Faça um programa que cria uma lista com 10 nomes. Em seguida, imprima o nome
 * da primeira pessoa da lista que possua o nome terminado com "berto". Se não
 * houver, dispare uma ZeroBertoException.
 */
public class Exercicio5 {

	public static void main(String[] args) {
		List<String> nomes = new ArrayList<>();

		nomes.add("Alberto");
		nomes.add("Roberto");
		nomes.add("Carlos");
		nomes.add("Mariana");
		nomes.add("Fernanda");
		nomes.add("João");
		nomes.add("Ana");
		nomes.add("Paulo");
		nomes.add("Bianca");
		nomes.add("Eduardo");

		System.out.println(new Exercicio5().buscaPrimeiroNomeTerminadoEmBerto(nomes));
	}
	
	public String buscaPrimeiroNomeTerminadoEmBerto(List<String> lista) {
		return lista.stream()
				.filter(Objects::nonNull)
				.filter(n -> n.endsWith("berto"))
				.findFirst()
				.orElseThrow(() -> new ZeroBertoException("Nenhum berto encontrado"));
	}

}
