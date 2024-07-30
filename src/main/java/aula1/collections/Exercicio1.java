package aula1.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

/**
 * Faça um programa que crie uma lista com 50 números inteiros aleatórios e
 * depois exiba-os ordenados do menor para o maior
 */
public class Exercicio1 {

	public static void main(String[] args) {
		List<Integer> lista = new ArrayList<>();
		Random r = new Random();
		for (int i = 0; i < 50; i++) {
			lista.add(r.nextInt(50));
		}
		System.out.println(lista);
		//Método 1
		Collections.sort(lista);
		System.out.println(lista);
		
		//Método 2
		lista.sort(Comparator.naturalOrder());
		System.out.println(lista);
	}

}
