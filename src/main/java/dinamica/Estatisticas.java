package dinamica;

import java.math.BigDecimal;
import java.util.Objects;

public class Estatisticas {

	private BigDecimal maiorSalario;
	private BigDecimal menorSalario;
	private BigDecimal media;
	private BigDecimal moda;
	private BigDecimal mediana;

	public Estatisticas(BigDecimal maiorSalario, BigDecimal menorSalario, BigDecimal media, BigDecimal moda,
			BigDecimal mediana) {
		this.maiorSalario = maiorSalario;
		this.menorSalario = menorSalario;
		this.media = media;
		this.moda = moda;
		this.mediana = mediana;
	}

	public BigDecimal getMaiorSalario() {
		return maiorSalario;
	}

	public void setMaiorSalario(BigDecimal maiorSalario) {
		this.maiorSalario = maiorSalario;
	}

	public BigDecimal getMenorSalario() {
		return menorSalario;
	}

	public void setMenorSalario(BigDecimal menorSalario) {
		this.menorSalario = menorSalario;
	}

	public BigDecimal getMedia() {
		return media;
	}

	public void setMedia(BigDecimal media) {
		this.media = media;
	}

	public BigDecimal getModa() {
		return moda;
	}

	public void setModa(BigDecimal moda) {
		this.moda = moda;
	}

	public BigDecimal getMediana() {
		return mediana;
	}

	public void setMediana(BigDecimal mediana) {
		this.mediana = mediana;
	}

	@Override
	public String toString() {
		return String.format("Maior salário: R$%.2f | Menor salário: R$%.2f | Média: R$%.2f | Moda: R$%.2f | Mediana: R$%.2f", maiorSalario,
				menorSalario, media, moda, mediana);
	}

	@Override
	public int hashCode() {
		return Objects.hash(maiorSalario, media, mediana, menorSalario, moda);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Estatisticas other = (Estatisticas) obj;
		return Objects.equals(maiorSalario, other.maiorSalario) && Objects.equals(media, other.media)
				&& Objects.equals(mediana, other.mediana) && Objects.equals(menorSalario, other.menorSalario)
				&& Objects.equals(moda, other.moda);
	}

	
}
