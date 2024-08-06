package aula5.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Faça um programa que cria uma lista com 50 números aleatórios de 1 a 100 e
 * retorne quantos números "25" há na lista.
 */
public class Exercicio3 {

	public static void main(String[] args) {
		Random r = new Random();
		List<Integer> lista = new ArrayList<>();
		for (int i = 0; i < 50; i++) {
			lista.add(r.nextInt(101));
		}

		System.out.println(lista);
		System.out.println(lista.stream()
				.filter(n -> n == 25)
				.count());
	}

}
