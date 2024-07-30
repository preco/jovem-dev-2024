package aula1.collections;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * Crie dois sets com 10 números aleatórios entre 1 e 30. Mostre os dois
 * conjuntos e, em seguida, mostre apenas os elementos que estiverem presentes
 * em ambos os conjuntos.
 */
public class Exercicio5 {

	public static void main(String[] args) {
		Set<Integer> conjunto1 = new HashSet<>();
		Set<Integer> conjunto2 = new HashSet<>();
		
		Random r = new Random();
		while(conjunto1.size() < 10) {
			conjunto1.add(r.nextInt(30) + 1);
		}
		while(conjunto2.size() < 10) {
			conjunto2.add(r.nextInt(30) + 1);
		}
		System.out.println(conjunto1);
		System.out.println(conjunto2);
		
		conjunto1.retainAll(conjunto2);
		System.out.println(conjunto1);
	}

}
