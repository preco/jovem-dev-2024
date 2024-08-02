package aula3.tratamentoerros;

import aula3.tratamentoerros.exceptions.ZeroException;

/**
 * Crie uma função que receba dois números inteiros e divida o primeiro pelo
 * segundo. Caso o segundo seja zero, dispare uma exceção chamada ZeroException
 * com a mensagem “O segundo número não pode ser zero”. Capture essa exceção e
 * mostre seu conteúdo ao usuário
 */
public class Exercicio2 {

	public static void main(String[] args) {
		try {
			System.out.println(divide(4, 0));
		} catch (ZeroException e) {
			System.err.println("Erro ao dividir: " + e.getMessage());
		}
	}

	private static Integer divide(Integer v1, Integer v2) throws ZeroException {
		if (v2 == 0) {
			throw new ZeroException("O segundo número não pode ser zero");
		}
		return v1/v2;
	}
}
