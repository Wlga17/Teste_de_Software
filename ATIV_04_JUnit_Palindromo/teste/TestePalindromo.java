import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class TestePalindromo {

	private Palindromo p;
	private boolean ePalindromo;
	
	@Before
	public void criarObjeto() {
		this.p = new Palindromo();
	}
	
	@Test(expected=NumberFormatException.class)
	public void testaPalindromoComNull() {
		//Arrumar
		String txt = "";
		
		//Agir
		ePalindromo = p.isPalindromo(txt);
		
		//Afirmar
		assertFalse(ePalindromo);
		assertNull(ePalindromo);
	}
	
	@Test
	public void testaPalindromoTrueComTexto() {
		//Arrumar
		String txt = "arara";
		
		//Agir
		ePalindromo = p.isPalindromo(txt);
				
		//Afirmar
		assertTrue(ePalindromo);
		assertNotNull(ePalindromo);
	}
	
	@Test
	public void testaPalindromoTrueComNumero() {
		//Arrumar
		String valor = "11211";
				
		//Agir
		ePalindromo = p.isPalindromo(valor);
						
		//Afirmar
		assertTrue(ePalindromo);
		assertNotNull(ePalindromo);
	}
	
	@Test
	public void testaPalindromoFalseComTexto() {
		//Arrumar
		String txt = "girafa";
		
		//Agir
		ePalindromo = p.isPalindromo(txt);
				
		//Afirmar
		assertFalse(ePalindromo);
		assertNotNull(ePalindromo);
	}
	
	@Test
	public void testaPalindromoFalseComNumero() {
		//Arrumar
		String valor = "11231";
				
		//Agir
		ePalindromo = p.isPalindromo(valor);
						
		//Afirmar
		assertFalse(ePalindromo);
		assertNotNull(ePalindromo);
	}
	
}
