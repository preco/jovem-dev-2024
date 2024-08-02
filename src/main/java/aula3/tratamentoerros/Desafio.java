package aula3.tratamentoerros;

import javax.swing.JOptionPane;

import aula3.tratamentoerros.exceptions.PrecoIncorretoException;
import aula3.tratamentoerros.exceptions.VendaException;

/**
 * Crie duas exceções: VendaException (exceção verificada) e
 * PrecoIncorretoException (exceção não verificada). Crie uma classe Venda com
 * atributos nomeCliente e itens (será uma lista de Item, uma classe com nome e
 * preco). Na classe Desafio, crie uma venda e peça para o usuário digitar o
 * nome do cliente e a quantidade de itens. Se ele digitar um número menor que 1
 * ou maior que 10, dispare VendaException e encerre o programa mostrando uma
 * mensagem. Ele deve digitar a quantidade de itens que escolheu (nome e preço).
 * Se digitar preço menor ou igual a zero, dispare PrecoIncorretoException e
 * peça para digitar novamente.
 */
public class Desafio {

	public static void main(String[] args) {
		Venda v = new Venda();
		try {
			String nome = JOptionPane.showInputDialog("Digite o cliente:");
			Integer quantidadeItens = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade:"));
			if (quantidadeItens < 1 || quantidadeItens > 10) {
				throw new VendaException("Valor fora do intervalo: " + quantidadeItens);
			}
			v.setNomeCliente(nome);
			preencheVenda(v, quantidadeItens);
			System.out.println(v);
		} catch (NumberFormatException | VendaException e) {
			System.err.println("Quantidade inválida: " + e.getMessage());
		}
	}

	private static void preencheVenda(Venda v, Integer quantidadeItens) {
		for (int i = 0; i < quantidadeItens; i++) {
			String nome = JOptionPane.showInputDialog("Digite o nome do produto:");
			Double preco = perguntaPreco();
			Item item = new Item(nome, preco);
			v.addItem(item);
		}
	}

	private static Double perguntaPreco() {
		while (true) {
			try {
				Double preco = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço:"));
				if (preco < 0) {
					throw new PrecoIncorretoException("Preço não pode ser negativo");
				}
				return preco;
			} catch (RuntimeException e) {
				System.err.println("Erro ao obter preço: " + e.getMessage());
			}
		}
	}

}
