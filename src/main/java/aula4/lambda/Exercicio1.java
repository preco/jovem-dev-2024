package aula4.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Faça um programa que preencha uma lista com 50 números aleatórios.
 * A seguir, mostre essa lista usando o método forEach
 */
public class Exercicio1 {

	public static void main(String[] args) {
		Random r = new Random();

		List<Integer> lista = new ArrayList<>();
		for (int i = 0; i < 50; i++) {
			lista.add(r.nextInt(100));
		}

		lista.forEach(System.out::println);
	}

}
