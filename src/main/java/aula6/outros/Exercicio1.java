package aula6.outros;

/**
 * Crie um enum chamado DiaSemanaEnum, cujos nomes serão os dias da semana e que
 * devem possuir os atributos nome e isFimDeSemana, um método abstrato que deve
 * ser implementado por cada enum. Na classe Exercicio1, percorra os valores do
 * enum, imprimindo o nome e se é ou não fim de semana.
 */
public class Exercicio1 {

	public static void main(String[] args) {
		for (DiaSemanaEnum d : DiaSemanaEnum.values()) {
			System.out.println(d);
		}

	}

}
