package aula3.tratamentoerros;

import javax.swing.JOptionPane;

/**
 * Faça um programa que peça para o usuário digitar um número inteiro. Se ele
 * digitar algo diferente disso, exiba a mensagem "Você digitou um valor não
 * reconhecido", até que ele digite um valor válido. Em seguida, mostre esse
 * valor
 */
public class Exercicio1 {

	public static void main(String[] args) {
		while (true) {
			try {
				Integer i = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro"));
				JOptionPane.showMessageDialog(null, "Numero digitado: " + i);
				break;
			} catch (RuntimeException e) {
				System.err.println("Erro ao obter número inteiro " + e);
			}
		}

	}

}
