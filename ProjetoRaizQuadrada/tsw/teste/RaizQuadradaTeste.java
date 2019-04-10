package teste;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import entidade.RaizQuadrada;

public class RaizQuadradaTeste {

	private RaizQuadrada r;
	private double resultado;

	@Before
	public void criarObjeto() {
		r = new RaizQuadrada();
	}
	
	@Test
	public void raizQuadradaComNumeroInteiroTest() {
		//Arrumar
		String numero = "9";
		double valorEsperado = 3;
		
		//Agir
		resultado = r.isRaizQuadrada(numero);
		
		//Afirmar
		assertEquals(valorEsperado, resultado, 0);
	}
	
	@Test
	public void raizQuadradaComNumeroDecimalTest() {
		//Arrumar
		String numero = "5.5";
		double valorEsperado = 2.345207879911715;
		
		//Agir
		resultado = r.isRaizQuadrada(numero);
		
		//Afirmar
		assertEquals(valorEsperado, resultado, 0);
	}
	
	@Test(expected=NumberFormatException.class)
	public void raizQuadradaSemNumeroTest() {
		//Arrumar
		String numero = "";
		double valorEsperado = 5;
				
		//Agir
		resultado = r.isRaizQuadrada(numero);
				
		//Afirmar
		assertNotEquals(valorEsperado, resultado);
	}
	
	@Test(expected=NumberFormatException.class)
	public void raizQuadradaComLetrasTest() {
		//Arrumar
		String numero = "ola";
		double valorEsperado = 5;
				
		//Agir
		resultado = r.isRaizQuadrada(numero);
				
		//Afirmar
		assertNotEquals(valorEsperado, resultado);
	}
	
	@Test(expected=NumberFormatException.class)
	public void raizQuadradaComNumeroInteiroNegativoTest() {
		//Arrumar
		String numero = "-9";
		double valorEsperado = 4;
		
		//Agir
		resultado = r.isRaizQuadrada(numero);
		
		//Afirmar
		assertNotEquals(valorEsperado, resultado);
	}
	
	@Test(expected=NumberFormatException.class)
	public void raizQuadradaComNumeroDecimalNegativoTest() {
		//Arrumar
		String numero = "-5.5";
		double valorEsperado = 3.211;
		
		//Agir
		resultado = r.isRaizQuadrada(numero);
		
		//Afirmar
		assertNotEquals(valorEsperado, resultado);
	}
	
	@After
	public void destruirObjeto() {
		r = null;
	}
}
