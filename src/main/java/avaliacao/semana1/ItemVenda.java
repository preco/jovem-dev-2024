package avaliacao.semana1;

public class ItemVenda {
	private Produto produto;
	private Double quantidade;

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public Double getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Double quantidade) {
		this.quantidade = quantidade;
	}

	public Double getTotal() {
		return quantidade * produto.getPrecoUnitario();
	}

	public String toString() {
		return "  " + produto.getNome() + "\n  "
				+ quantidade + "x " + produto.getPrecoUnitario()
				+ " ............... " + getTotal();
	}
}
