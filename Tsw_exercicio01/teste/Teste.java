import org.junit.Test;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Ignore;

public class Teste {

	private Calculadora c;
	
	@Before
	public void criaCalculadora() {
		this.c = new Calculadora();
	}
	
	@Test
	public void testeSomarComNumerosPositivos() {
		String valor1 = "1";
		String valor2 = "2";
		int resultado = c.somar(valor1,valor2);
		int valorEsperado = 3;
		assertEquals(valorEsperado, resultado);
	}
	
	@Test
	public void testeSomarComNumerosNegativos() {
		String valor1 = "-3";
		String valor2 = "-4";
		int resultado = c.somar(valor1,valor2);
		int valorEsperado = -7;
		assertEquals(valorEsperado, resultado);
	}
	
	@Test(expected=RuntimeException.class)
	public void testeSomarSemValor() {
		String valor1 = "2";
		String valor2 = "";
		int resultado = c.somar(valor1,valor2);
	}
	
	@Test
	public void testeDividir1Por10() {
		String valor1 = "1";
		String valor2 = "10";
		double valorEsperado = 0.1;
		double resultado = c.dividir(valor1,valor2);
		assertEquals(valorEsperado, resultado, 0);
	}

	@Test
	public void testeDividir10Por1() {
		String valor1 = "10";
		String valor2 = "1";
		double valorEsperado = 10;
		double resultado = c.dividir(valor1,valor2);
		assertEquals(valorEsperado, resultado, 0);
	}

	@Test
	public void testeDividirValoresNaoInteiro() {
		String valor1 = "2.57";
		String valor2 = "5.29";
		double valorEsperado = 0.48582230623818523;
		double resultado = c.dividir(valor1,valor2);
		assertEquals(valorEsperado, resultado, 0);
	}
	
	@Test(expected=RuntimeException.class)
	public void testeDividirSemValor() {
		String valor1 = "";
		String valor2 = "10";
		double resultado = c.dividir(valor1,valor2);
	}
		
	@Test(expected=RuntimeException.class)
	public void testeRaizQuadradaSemValor() {
		String valor1 = "";
		double resultado = c.raizQuadrada(valor1);
	}
	
	@Test
	public void testeRaizQuadradaComValor() {
		String valor1 = "9";
		double valorEsperado = 3;
		double resultado = c.raizQuadrada(valor1);
		assertEquals(valorEsperado, resultado, 0);
	}
}
