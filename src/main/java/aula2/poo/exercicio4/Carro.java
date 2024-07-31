package aula2.poo.exercicio4;

public class Carro {
	private String modelo;
	private String cor;
	private Integer ano;
	
	public Carro(String modelo, String cor, Integer ano) {
		this.modelo = modelo;
		this.cor = cor;
		this.ano = ano;
	}
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public Integer getAno() {
		return ano;
	}
	public void setAno(Integer ano) {
		this.ano = ano;
	}

	@Override
	public String toString() {
		return "Modelo: " + modelo + ", cor: " + cor + ", ano: " + ano;
	}
	
}
