package dinamica;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class AnaliseDados {

	/**
	 * Quais os 10 maiores salários da empresa?
	 */
	public List<Funcionario> obtemDezMaioresSalarios(List<Funcionario> lista) {
		return lista.stream()
				.sorted(Comparator.comparing(Funcionario::getSalario).reversed())
				.limit(10)
				.collect(Collectors.toList());
	}

	/**
	 * Qual a média de salário por cargo?
	 */
	public Map<DepartamentoEnum, Double> obtemMediaSalarioPorCargo(List<Funcionario> lista){
		return 
				lista.stream()
					.collect(Collectors.groupingBy(c -> c.getCargo(),
						Collectors.averagingDouble(f -> f.getSalario().doubleValue())));
	}

	/**
	 * Qual seria o impacto, em reais, de oferecer um reajuste de 10% a todos os funcionários?
	 **/
	public Double obtemImpactoReajuste(List<Funcionario> lista) {
		return lista
				.stream()
				.map(Funcionario::getSalario)
				.mapToDouble(BigDecimal::doubleValue)
				.map(d -> d * 0.1)
				.sum();
	}

	/**
	 * Qual o percentual de cada cargo em relação ao total de funcionários?
	 **/
	public Map<DepartamentoEnum, Double> obtemPercentualFuncionarios(List<Funcionario> lista){
		return lista.stream()
					.collect(Collectors.groupingBy(Funcionario::getCargo,
						Collectors.collectingAndThen(Collectors.toList(), l -> l.size() * 100.0 / lista.size() )));
	}

	/**
	 * Qual o menor salário, o maior salário, a média, a moda e a mediana de salário por cargo?
	 **/
	public Map<DepartamentoEnum, Estatisticas> obtemEstatisticas(List<Funcionario> lista){
		return lista
				.stream()
				.collect(Collectors
						.collectingAndThen(Collectors.groupingBy(Funcionario::getCargo), this::getEstatisticas));
	}

	private Map<DepartamentoEnum, Estatisticas> getEstatisticas(Map<DepartamentoEnum, List<Funcionario>> l) {
		return l.entrySet().stream().collect(
				Collectors.toMap(Entry::getKey,
				li -> obtemEstatistica(li.getValue().stream()
					.map(Funcionario::getSalario)
					.collect(Collectors.toList()))));
	}
	
	private Estatisticas obtemEstatistica(List<BigDecimal> l) {
		BigDecimal menor = l.stream().sorted().limit(1).findFirst().orElse(BigDecimal.ZERO);
		BigDecimal maior = l.stream().sorted(Comparator.reverseOrder()).limit(1).findFirst().orElse(BigDecimal.ZERO);
		BigDecimal media = l.stream().reduce(BigDecimal.ZERO, BigDecimal::add)
					.divide(BigDecimal.valueOf(l.size()), 4, RoundingMode.HALF_EVEN);
		
		BigDecimal moda = calculaModa(l);
		BigDecimal mediana = calculaMediana(l);
		
		return new Estatisticas(maior, menor, media, moda, mediana);
		
	}

	private BigDecimal calculaMediana(List<BigDecimal> l) {
		l.sort(Comparator.naturalOrder());
		int meio = l.size() / 2;
		
		if (l.size() % 2 == 0) {
			BigDecimal posicaoIntermediaria1 = l.get(meio);
			BigDecimal posicaoIntermediaria2 = l.get(meio - 1);
			return (posicaoIntermediaria1.add(posicaoIntermediaria2)).divide(BigDecimal.valueOf(2), 2, RoundingMode.HALF_EVEN);
		}

		return l.get(meio / 2).setScale(2);
	}

	private BigDecimal calculaModa(List<BigDecimal> l) {
		Map<BigDecimal, Long> contadores  = l.stream().collect(Collectors.groupingBy(b -> b, Collectors.counting()));
		return contadores.entrySet()
					.stream()
					.sorted(Comparator.comparing(Entry::getValue, Comparator.reverseOrder()))
					.limit(1)
					.map(Entry::getKey)
					.findFirst()
						.orElse(BigDecimal.ZERO);
	}

	/**
	 * Qual departamento possui o maior orçamento?
	 **/
	public DepartamentoEnum obtemDepartamentoMaiorOrcamento(List<Funcionario> l) {
		Map<DepartamentoEnum, Double> mapa = l.stream()
				.collect(Collectors.groupingBy(Funcionario::getCargo,
						Collectors.summingDouble(f -> f.getSalario().doubleValue())));
		return mapa.entrySet().stream()
				.sorted(Comparator.comparing(Entry::getValue, Comparator.reverseOrder()))
				.limit(1)
				.map(Entry::getKey)
				.findFirst().orElseThrow(IllegalArgumentException::new);
	}
	
	/**
	 * Qual departamento possui a maior média salarial?
	 **/
	public DepartamentoEnum obtemMaiorMediaSalarial(List<Funcionario> l) {
		return obtemMediaSalarioPorCargo(l).entrySet().stream()
				.sorted(Comparator.comparing(Entry::getValue, Comparator.reverseOrder()))
				.limit(1)
				.map(Entry::getKey)
				.findFirst().orElseThrow(IllegalArgumentException::new);
	}
}
