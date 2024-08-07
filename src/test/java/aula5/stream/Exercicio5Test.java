package aula5.stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import aula5.stream.exceptions.ZeroBertoException;

class Exercicio5Test {

	private List<String> nomes;
	private static Exercicio5 exercicio;
	
	@BeforeAll
	static void init() {
		exercicio = new Exercicio5();
	}
	
	@BeforeEach
	void setup() {
		nomes = new ArrayList<>();		
	}
	
	@DisplayName("Se houver mais de um nome terminado em Berto, retorna o primeiro")
	@Test
	void deveRetornarPrimeiroNomeTerminadoEmBerto() {
		
		nomes.add("Alberto");
		nomes.add("Roberto");
		nomes.add("Carlos");
		
		String retorno = exercicio.buscaPrimeiroNomeTerminadoEmBerto(nomes);
		
		assertEquals("Alberto", retorno);
	}
	
	@DisplayName("Se a lista estiver vazia, deve disparar ZeroBertoException")
	@Test
	void deveDispararExcecaoSeListaVazia() {
		
		assertThrows(ZeroBertoException.class, () -> exercicio.buscaPrimeiroNomeTerminadoEmBerto(nomes));
	}
	
	@DisplayName("Se houver um elemento nulo e houver um berto, deve trazer o berto")
	@Test
	void deveTrazerNomeMesmoComElementoNulo() {

		nomes.add(null);
		nomes.add("Alberto");
		nomes.add("Carlos");
		
		String retorno = exercicio.buscaPrimeiroNomeTerminadoEmBerto(nomes);
		
		assertEquals("Alberto", retorno);
	}
	
	@DisplayName("Se não houver um berto na lista, deve disparar ZeroBertoException")
	@Test
	void deveDispararExcecaoSeNaoHouverBerto() {

		nomes.add("João");
		nomes.add("Augusto");
		nomes.add("Carlos");
		
		assertThrows(ZeroBertoException.class, () -> exercicio.buscaPrimeiroNomeTerminadoEmBerto(nomes));
	}

}
