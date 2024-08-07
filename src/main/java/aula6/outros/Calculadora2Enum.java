package aula6.outros;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public enum Calculadora2Enum {
	SOMA("Soma", (v1, v2) -> v1 + v2),
	SUBTRACAO("Subtração", (v1, v2) -> v1 - v2),
	MULTIPLICACAO("Multiplicação", (v1, v2) -> v1 * v2),
	DIVISAO("Divisão", (v1, v2) -> v1 / v2);

	private String nomeAmigavel;
	
	//Optei por utilizar BinaryOperator por ser uma especialização
	//de BiFunction que pode ser utilizada quando os parâmetros
	//e o resultado possuem o mesmo tipo.
	private BinaryOperator<Integer> calculo;

	private Calculadora2Enum(String nomeAmigavel, BinaryOperator<Integer> calculo) {
		this.nomeAmigavel = nomeAmigavel;
		this.calculo = calculo;
	}

	public String getNomeAmigavel() {
		return nomeAmigavel;
	}

	public BiFunction<Integer, Integer, Integer> getCalculo() {
		return calculo;
	}
}
