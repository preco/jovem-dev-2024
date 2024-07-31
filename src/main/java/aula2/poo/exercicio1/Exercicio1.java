package aula2.poo.exercicio1;

import javax.swing.JOptionPane;

/**
 * Faça um programa que peça ao usuário que digite um número com vírgula e
 * mostre a ele a representação inteira do número (ou seja, sem a vírgula)
 */
public class Exercicio1 {

	public static void main(String[] args) {
		String numeroString = JOptionPane.showInputDialog("Digite um número com vírgula:");
		double numero = Double.parseDouble(numeroString.replace(',', '.'));
		int numeroSemVirgula = (int)numero;
		System.out.println("Numero sem vírgula: " + numeroSemVirgula);
		

	}

}
