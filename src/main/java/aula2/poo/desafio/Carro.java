package aula2.poo.desafio;

public class Carro implements Comparable<Carro> {
	private String modelo;
	private Integer ano;

	public Carro(String modelo, Integer ano) {
		this.modelo = modelo;
		this.ano = ano;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	@Override
	public String toString() {
		return "Modelo: " + modelo + ", ano: " + ano;
	}

	@Override
	public int compareTo(Carro o) {
		return this.getAno().compareTo(o.getAno());
	}

}
