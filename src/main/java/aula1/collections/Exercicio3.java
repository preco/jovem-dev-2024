package aula1.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

/**
 * Faça um programa que crie uma lista com 50 números inteiros com valor máximo
 * 20. Mostre a lista e, em seguida, mostre apenas os números contidos na lista,
 * sem repetição. Não utilize nenhuma estrutura de repetição para fazer essa
 * tarefa.
 */
public class Exercicio3 {

	public static void main(String[] args) {
		List<Integer> lista = new ArrayList<>();
		Random r = new Random();
		for (int i = 0; i < 50; i++) {
			lista.add(r.nextInt(21));
		}
		System.out.println(lista);
		
		Set<Integer> conjunto = new HashSet<>();
		conjunto.addAll(lista);
		
		System.out.println(conjunto);
	}

}
