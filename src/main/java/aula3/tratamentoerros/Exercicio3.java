package aula3.tratamentoerros;

import java.util.ArrayList;
import java.util.List;

/**
 * Crie um programa que dispare as seguintes exceções: ArithmeticException,
 * NullPointerException, StringIndexOutOfBoundsException e
 * IllegalStateException. Utilize o try-catch parar capturar a exceção e
 * mostre-a usando printStackTrace(). Não é permitido disparar a exceção via
 * inicialização (throw new NullPointerException(), por exemplo)
 */
public class Exercicio3 {

	public static void main(String[] args) {
		try {
			Integer i = 5 / 0;
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}

		try {
			String s = null;
			s.contains("a");
		} catch (NullPointerException e) {
			e.printStackTrace();
		}

		try {
			String s = "012";
			s.charAt(3);
		} catch (StringIndexOutOfBoundsException e) {
			e.printStackTrace();
		}

		try {
			List<Integer> lista = new ArrayList<>();
			lista.listIterator().remove();
		} catch (IllegalStateException e) {
			e.printStackTrace();
		}
	}
}
