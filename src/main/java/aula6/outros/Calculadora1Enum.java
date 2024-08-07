package aula6.outros;

public enum Calculadora1Enum {
	SOMA("Soma", (v1, v2) -> v1 + v2),
	SUBTRACAO("Subtração", (v1, v2) -> v1 - v2),
	MULTIPLICACAO("Multiplicação", (v1, v2) -> v1 * v2),
	DIVISAO("Divisão", (v1, v2) -> v1 / v2);

	private String nomeAmigavel;
	private CalculoInterface calculo;

	private Calculadora1Enum(String nomeAmigavel, CalculoInterface calculo) {
		this.nomeAmigavel = nomeAmigavel;
		this.calculo = calculo;
	}

	public String getNomeAmigavel() {
		return nomeAmigavel;
	}

	public CalculoInterface getCalculo() {
		return calculo;
	}

}
