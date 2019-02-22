import org.junit.Test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;

public class Teste {

	Calculadora c = new Calculadora();
	
	@Test
	public void testeSomar() {
		int resultado = c.somar("1", "3");
		Assert.assertEquals(4, resultado);
	}
	
	@Ignore
	public void testeDividir() {
		double resultado = c.dividir("4", "2");
		
	}
	
	@Ignore
	public void testeRaizQuadrada() {
		double resultado = c.raizQuadrada("9");
	}
}
