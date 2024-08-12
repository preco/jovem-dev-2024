package dinamica;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class AnaliseDadosTest {

	@DisplayName("Deve calcular as estatísticas, usando como cálculo de mediana uma lista ímpar")
	@Test
	void deveExibirEstatisticasListaImpar() {
		List<Funcionario> lista = Arrays.asList(
					new Funcionario("Pedro", DepartamentoEnum.VENDAS, BigDecimal.valueOf(1000)),
					new Funcionario("Pedro", DepartamentoEnum.VENDAS, BigDecimal.valueOf(1000)),
					new Funcionario("Pedro", DepartamentoEnum.VENDAS, BigDecimal.valueOf(1000)),
					new Funcionario("Pedro", DepartamentoEnum.VENDAS, BigDecimal.valueOf(2000)),
					new Funcionario("Pedro", DepartamentoEnum.VENDAS, BigDecimal.valueOf( 100))
				);
		
		Map<DepartamentoEnum, Estatisticas> mapa = new AnaliseDados().obtemEstatisticas(lista);
		
		Estatisticas esperado = new Estatisticas(
				BigDecimal.valueOf(2000),
				BigDecimal.valueOf( 100),
				BigDecimal.valueOf(1020).setScale(4),
				BigDecimal.valueOf(1000),
				BigDecimal.valueOf(1000).setScale(2));
		assertEquals(esperado, mapa.get(DepartamentoEnum.VENDAS));
	}
	
	@DisplayName("Deve calcular as estatísticas, usando como cálculo de mediana uma lista par")
	@Test
	void deveExibirEstatisticasListaPar() {
		List<Funcionario> lista = Arrays.asList(
				new Funcionario("Pedro", DepartamentoEnum.VENDAS, BigDecimal.valueOf( 100)),
				new Funcionario("Pedro", DepartamentoEnum.VENDAS, BigDecimal.valueOf(1000)),
				new Funcionario("Pedro", DepartamentoEnum.VENDAS, BigDecimal.valueOf(1000)),
				new Funcionario("Pedro", DepartamentoEnum.VENDAS, BigDecimal.valueOf(1100)),
				new Funcionario("Pedro", DepartamentoEnum.VENDAS, BigDecimal.valueOf(1200)),
				new Funcionario("Pedro", DepartamentoEnum.VENDAS, BigDecimal.valueOf(2000))
				);
		
		Map<DepartamentoEnum, Estatisticas> mapa = new AnaliseDados().obtemEstatisticas(lista);
		
		Estatisticas esperado = new Estatisticas(
				BigDecimal.valueOf(2000),
				BigDecimal.valueOf( 100),
				BigDecimal.valueOf(1066.6667).setScale(4),
				BigDecimal.valueOf(1000),
				BigDecimal.valueOf(1050).setScale(2));
		assertEquals(esperado, mapa.get(DepartamentoEnum.VENDAS));
	}

}
