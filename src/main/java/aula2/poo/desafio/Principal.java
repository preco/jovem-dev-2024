package aula2.poo.desafio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.swing.JOptionPane;

/**
 * Crie uma classe chamada Carro, que vai conter 2 atributos: Modelo e Ano. Em
 * seguida, no construtor da classe Principal, peça ao usuário para digitar
 * modelo, e ano de carros. Ele deve continuar digitando até que que escreva
 * “fim” no campo modelo. Nesse momento, o sistema deve exibir os carros em
 * ordem decrescente de idade (ou seja, do mais velho ao mais novo).
 */
public class Principal {

	public static void main(String[] args) {
		List<Carro> lista = new ArrayList<>();
		
		while(true) {
			String modelo = JOptionPane.showInputDialog("Digite o modelo:");
			if (modelo.equals("fim")) {
				break;
			}
			Integer ano = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano:"));
			lista.add(new Carro(modelo, ano));
		}

		Collections.sort(lista);
		
		for (Carro c : lista) {
			System.out.println(c);
		}
	}

}
