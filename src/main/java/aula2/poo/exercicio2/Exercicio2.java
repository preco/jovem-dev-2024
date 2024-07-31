package aula2.poo.exercicio2;

import javax.swing.JOptionPane;

/**
 * Faça um programa que peça ao usuário que digite duas frases e depois diga a
 * ele se as frases digitadas são iguais. Informe ainda a quantidade de
 * caracteres de cada frase.
 */
public class Exercicio2 {

	public static void main(String[] args) {
		String frase1 = JOptionPane.showInputDialog("Digite a primeira frase:");
		String frase2 = JOptionPane.showInputDialog("Digite a segunda frase:");
		
		System.out.println("São iguais? " + frase1.equals(frase2));
		System.out.println("Caracteres da frase 1: " + frase1.length());
		System.out.println("Caracteres da frase 2: " + frase2.length());
		
	}

}
