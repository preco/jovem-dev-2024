package aula5.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Faça um programa que cria uma lista com 50 números
 * aleatórios de 1 a 100 e imprime a soma de todos os números
 */
public class Exercicio1 {

	public static void main(String[] args) {
		Random r = new Random();
		List<Integer> lista = new ArrayList<>();
		for (int i = 0; i < 50; i++) {
			lista.add(r.nextInt(101));
		}
		
		System.out.println(lista);
		System.out.println(lista.stream().mapToInt(Integer::intValue).sum());
	}

}
