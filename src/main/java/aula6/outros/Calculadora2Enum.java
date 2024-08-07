package aula6.outros;

import java.util.function.BiFunction;

public enum Calculadora2Enum {
	SOMA("Soma", (v1, v2) -> v1 + v2),
	SUBTRACAO("Subtração", (v1, v2) -> v1 - v2),
	MULTIPLICACAO("Multiplicação", (v1, v2) -> v1 * v2),
	DIVISAO("Divisão", (v1, v2) -> v1 / v2);

	private String nomeAmigavel;
	private BiFunction<Integer, Integer, Integer> calculo;

	private Calculadora2Enum(String nomeAmigavel, BiFunction<Integer, Integer, Integer> calculo) {
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
