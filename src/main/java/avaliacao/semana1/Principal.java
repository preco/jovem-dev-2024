package avaliacao.semana1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.function.Consumer;

import javax.swing.JOptionPane;

import avaliacao.semana1.exceptions.QuantidadeInvalidaException;

public class Principal {

	public static void main(String[] args) {
		System.out.println("Iniciando venda");
		Venda venda = new Venda();
		
		String nome = JOptionPane.showInputDialog("Digite o nome do cliente");
		String dataNascimentoStr = JOptionPane.showInputDialog("Digite a data de nascimento (dd/mm/yyyy)");
		LocalDate dataNascimento = LocalDate.parse(dataNascimentoStr, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		
		Cliente cliente = criaCliente(nome);
		cliente.setNome(nome);
		cliente.setDataNascimento(dataNascimento);
		venda.setCliente(cliente);
		
		adicionaItensNaVenda(venda);

		Integer formaPagamento = Integer.parseInt(JOptionPane.showInputDialog("Digite a forma de pagamento"));
		venda.setFormaPagamento(formaPagamento);

		//Venda finalizada
		System.out.println(venda);
	}

	private static Cliente criaCliente(String nome) {
		return Cliente.isClientePremium.test(nome) ? new ClientePremium() : new Cliente();
	}

	private static void adicionaItensNaVenda(Venda v) {
		Consumer<ItemVenda> addItem = v::addItemVenda;
		
		while(true) {
			String nomeProduto = JOptionPane.showInputDialog("Digite o nome do produto (ou 'fim' para encerrar)");
			if (nomeProduto.equals("fim")) {
				break;
			}

			Double precoUnitario = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor unitário"));

			Produto p = new Produto();
			p.setNome(nomeProduto);
			p.setPrecoUnitario(precoUnitario);

			Double quantidade = perguntaQuantidade();
			
			ItemVenda item = new ItemVenda();
			item.setProduto(p);
			item.setQuantidade(quantidade);

			addItem.accept(item);
		}
	}

	private static Double perguntaQuantidade() {
		while (true) {
			try {
				Double quantidade = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade"));
				if (quantidade < 1 || quantidade > 50) {
					throw new QuantidadeInvalidaException("Quantidade deve estar entre 0 e 50");
				}
				return quantidade;
			} catch (NumberFormatException | QuantidadeInvalidaException e) {
				System.err.println("Quantidade inválida");
			}
		}
	}
}
