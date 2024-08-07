package aula6.outros;

public class Exercicio3 {

	public static void main(String[] args) {
		for (Calculadora2Enum c : Calculadora2Enum.values()) {
			System.out.println("Nome: " + c.getNomeAmigavel());
			System.out.println(c.getCalculo().apply(3,  5));
		}

	}

}
