package aula6.outros;

import java.math.BigDecimal;
import java.math.RoundingMode;

import javax.swing.JOptionPane;

/**
 * Faça um programa que peça para o usuário digitar um número inteiro
 * correspondente à circunferência de um círculo. Com base nesse valor, calcule
 * o raio desse círculo. Utilize BigDecimal para efetuar esse cálculo.
 * Utilize:
 * C = 2 π r
 * Math.PI
 * Caso o resultado possua mais de 4 casas decimais,
 * efetue o arredondamento para par (half even).
 */
public class Exercicio5 {

	public static void main(String[] args) {

		BigDecimal circ = new BigDecimal(JOptionPane.showInputDialog("Digite a circunferência"));
		
		BigDecimal raio = circ.divide(BigDecimal.valueOf(Math.PI * 2), 4, RoundingMode.HALF_EVEN);
		
		System.out.println(raio);
		
		
		
		

	}

}
