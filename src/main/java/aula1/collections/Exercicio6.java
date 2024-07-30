package aula1.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.swing.JOptionPane;

/**
 * Faça um programa que leia o nome de 5 alunos. Em seguida, leia 3 notas de
 * cada um dos 5 alunos. Armazene esses dados em um mapa, cuja chave é o nome do
 * aluno. Quando o usuário terminar de digitar as notas, exiba o nome do aluno,
 * suas notas e a média.
 */
public class Exercicio6 {

	public static void main(String[] args) {
		Map<String, List<Double>> mapa = new HashMap<>();
		for (int i = 0; i < 5; i++) {
			String nome = JOptionPane.showInputDialog("Digite o nome do aluno:");
			mapa.put(nome, new ArrayList<>());
		}
		
		for (Map.Entry<String, List<Double>> e : mapa.entrySet()) {
			leNotas(e);
		}

		for (Map.Entry<String, List<Double>> e : mapa.entrySet()) {
			System.out.println("Nome:  " + e.getKey());
			System.out.println("Notas: ");
			double soma = 0;
			for(Double nota : e.getValue()) {
				soma += nota;
				System.out.println("  " + nota);
			}
			double media = soma / 3;
			System.out.println("Média: " + media);
			System.out.println("**********************");
		}
	}

	private static void leNotas(Entry<String, List<Double>> e) {
		for (int i = 1; i <= 3; i++) {
			Double nota = Double.parseDouble(JOptionPane.showInputDialog("Digite a " + i + "a. nota de " + e.getKey()));
			e.getValue().add(nota);
		}		
	}
	

}
