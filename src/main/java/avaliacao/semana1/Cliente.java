package avaliacao.semana1;

import java.time.LocalDate;
import java.util.function.Predicate;

public class Cliente {
	
	public static Predicate<String> isClientePremium = s -> s.startsWith("Thiago ");
	
	private String nome;
	private LocalDate dataNascimento;

	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public LocalDate getDataNascimento() {
		return dataNascimento;
	}


	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public boolean clientePremium() {
		return isClientePremium.test(nome);
	}
	
	@Override
	public String toString() {
		return String.format("Cliente: %s", getNomeComMascara());
	}


	public Integer getDesconto() {
		LocalDate hoje = LocalDate.now();
		if (dataNascimento.getDayOfMonth() == hoje.getDayOfMonth() 
				&& dataNascimento.getMonthValue() == hoje.getMonthValue()) {
			return 30;
		}
		if (clientePremium()) {
			return 20;
		}
		if (hoje.minusYears(60).isAfter(dataNascimento)) {
			return 10;
		}
		return 0;
	}


	public String getNomeComMascara() {
		String nomeComMascara = "";
		for (int i = 0; i < nome.length(); i++){
			if (i == 0 || nome.charAt(i) == ' ') {
				nomeComMascara += nome.charAt(i);
			} else {
				nomeComMascara += '*';
			}
		}
		return nomeComMascara;
	}

}
