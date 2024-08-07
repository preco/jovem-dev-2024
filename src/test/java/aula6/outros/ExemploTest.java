package aula6.outros;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ExemploTest {


	@DisplayName("Se o número for 0, deve retornar ZERO")
	@Test
	void deveRetornarZeroSeNumeroIgualA0() {
		int valor = 0;
		
		Exemplo ex = new Exemplo();
		String s = ex.verificaNumero(valor);
		
		assertEquals("ZERO", s);
	}
	
	@DisplayName("Se for diferente de zero, deve disparar exceção")
	@Test
	void deveDispararSeDiferenteDeZero() {
		int valor = 3;
		
		Exemplo ex = new Exemplo();
		
		assertThrows(IllegalArgumentException.class, () -> ex.verificaNumero(valor));
	}

}
