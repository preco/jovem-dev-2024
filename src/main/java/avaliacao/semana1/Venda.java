package avaliacao.semana1;

import java.util.ArrayList;
import java.util.List;

public class Venda {
	private Cliente cliente;
	private List<ItemVenda> itens = new ArrayList<>();
	private Integer formaPagamento;

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<ItemVenda> getItens() {
		return itens;
	}

	public Integer getFormaPagamento() {
		return formaPagamento;
	}

	public void setFormaPagamento(Integer formaPagamento) {
		this.formaPagamento = formaPagamento;
	}

	public void addItemVenda(ItemVenda item) {
		this.itens.add(item);
	}

	public Double getTotalBruto() {
		Double soma = 0.0;
		for (ItemVenda item : itens) {
			soma += item.getTotal();
		}
		return soma;
	}

	public Double getTotalLiquido() {
		Double desconto = getTotalBruto() * cliente.getDesconto() / 100.0;
		return getTotalBruto() - desconto;
	}

	public String toString() {
		String texto = "************* CUPOM ***************\n\n";
		
		for (ItemVenda i : itens) {
			texto += i.toString() + "\n";
		}
		
		texto +=  "\nSubTotal ............... " + getTotalBruto() + "\n";
		
		if (cliente.getDesconto() > 0) {
			texto += getTextoDesconto(cliente.getDesconto()) + "\n";
		}
		
		texto += "\nTotal .................. " + getTotalLiquido();
		texto += "\nForma de pagamento: " + getTextoFormaPagamento();
		texto += "\n" + cliente;
		return texto;
	}

	private String getTextoFormaPagamento() {
		switch (formaPagamento) {
		case 1:
			return "Cartão de crédito";
		case 2:
			return "Cartão de débito";
		default:
			return "Dinheiro";
		}
	}

	private String getTextoDesconto(Integer desconto) {
		switch (desconto) {
		case 30:
			return "Descto. 30% aniversariante";
		case 20:
			return "Descto. 20% cliente premium";
		default:
			return "Descto. 10% terceira idade";
		}

	}
}
