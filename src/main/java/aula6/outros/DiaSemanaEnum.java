package aula6.outros;

public enum DiaSemanaEnum {

	DOMINGO("Domingo") {
		@Override
		boolean isFimDeSemana() {
			return true;
		}
	},
	SEGUNDA("Segunda-feira") {
		@Override
		boolean isFimDeSemana() {
			return false;
		}
	},
	TERCA("Terça-feira") {
		@Override
		boolean isFimDeSemana() {
			return false;
		}
	},
	QUARTA("Quarta-feira") {
		@Override
		boolean isFimDeSemana() {
			return false;
		}
	},
	QUINTA("Quinta-feira") {
		@Override
		boolean isFimDeSemana() {
			return false;
		}
	},
	SEXTA("Sexta-feira") {
		@Override
		boolean isFimDeSemana() {
			return false;
		}
	},
	SABADO("Sábado") {
		@Override
		boolean isFimDeSemana() {
			return true;
		}
	};

	private String nome;

	private DiaSemanaEnum(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}

	abstract boolean isFimDeSemana();
	
	@Override
	public String toString() {
		String fimDeSemana = isFimDeSemana() ? "Sim" : "Não";
		return String.format("%s - Fim de semana? %s",
				nome, fimDeSemana);
	}
}
