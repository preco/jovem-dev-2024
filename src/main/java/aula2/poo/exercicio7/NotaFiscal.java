package aula2.poo.exercicio7;

public class NotaFiscal {

	private String emitente;
	private Double valor;
	
	public void calculaValor(Double precoBruto, Double porcentagemDesconto) {
		Double valorDesconto = precoBruto * porcentagemDesconto / 100; 
		this.valor = precoBruto - valorDesconto; 
	}
	
	public String getEmitente() {
		return emitente;
	}
	public void setEmitente(String emitente) {
		this.emitente = emitente;
	}
	public Double getValor() {
		return valor;
	}

	@Override
	public String toString() {
		return "Emitente: " + emitente + ", valor: " + valor;
	}
	
}
