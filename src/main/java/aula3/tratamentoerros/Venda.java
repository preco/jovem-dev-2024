package aula3.tratamentoerros;

import java.util.ArrayList;
import java.util.List;

public class Venda {
	private String nomeCliente;
	private List<Item> itens;
	
	public Venda() {
		itens = new ArrayList<>();
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public List<Item> getItens() {
		return itens;
	}

	public void addItem(Item item) {
		this.itens.add(item);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Nome do cliente: ")
			.append(nomeCliente);
		sb.append("\nItens:\n\t");
		for (Item i : itens) {
			sb.append(i).append("\n\t");
		}
		
		return sb.toString();
	}
		
}
