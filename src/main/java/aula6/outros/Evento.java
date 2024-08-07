package aula6.outros;

import java.time.LocalDateTime;

public class Evento {

	private String nome;
	private LocalDateTime data;
	private TipoEventoEnum tipo;
	
	public Evento(String nome, LocalDateTime data, TipoEventoEnum tipo) {
		this.nome = nome;
		this.data = data;
		this.tipo = tipo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDateTime getData() {
		return data;
	}

	public void setData(LocalDateTime data) {
		this.data = data;
	}

	public TipoEventoEnum getTipo() {
		return tipo;
	}

	public void setTipo(TipoEventoEnum tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return String.format("Evento [nome=%s, data=%s, tipo=%s]", nome, data, tipo);
	}
	
}
