package aula6.outros;

/**
 * Crie um enum chamado Calculadora1Enum, com os valores SOMA, SUBTRACAO,
 * DIVISAO e MULTIPLICACAO, que deve possuir os atributos “nomeAmigavel”
 * (contendo o nome da operação com acentuação) e a implementação de uma
 * interface funcional CalculoInterface que possui um método calcula, recebendo
 * dois inteiros e retornando um inteiro No arquivo Exercicio2, mostre um
 * exemplo para cada enum.
 */
public class Exercicio2 {

	public static void main(String[] args) {
		for (Calculadora1Enum c : Calculadora1Enum.values()) {
			System.out.println(c.getNomeAmigavel() 
					+ ": " 
					+ c.getCalculo().calcula(5,  3));
		}

	}

}
