package aula1.collections;

import java.util.HashMap;
import java.util.Map;

import javax.swing.JOptionPane;

/**
 * Faça um programa que peça para o usuário digitar uma frase. Em seguida,
 * mostre a quantidade de vezes que cada caractere aparece na frase. Utilize a
 * coleção HashMap para esta tarefa.
 */
public class Exercicio4 {

	public static void main(String[] args) {
		String frase = JOptionPane.showInputDialog("Digite uma frase:");
		Map<Character, Integer> mapa = new HashMap<>();
		
		for (int i = 0; i < frase.length(); i++) {
			Character caracter = frase.charAt(i);
			Integer quantidade = 1;
			if (mapa.containsKey(caracter)) {
				quantidade += mapa.get(caracter);
			}
			mapa.put(caracter, quantidade);
		}

		System.out.println(mapa);
	}

}
