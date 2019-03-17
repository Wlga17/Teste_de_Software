import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class TestePalindromo {

	private Palindromo p;
	
	@Before
	public void criarObjeto() {
		this.p = new Palindromo();
	}
	
	@Test(expected=NumberFormatException.class)
	public void testaPalindromoComNull() {
		//Arrumar
		String txt = "";
		boolean ePalindromo;
		
		//Agir
		ePalindromo = p.isPalindromo(txt);
		
		//Afirmar
		assertFalse(ePalindromo);
		assertNull(txt);
	}
	
	@Test
	public void testaPalindromoTrue() {
		//Arrumar
		String txt = "arara";
		boolean ePalindromo;
		
		//Agir
		ePalindromo = p.isPalindromo(txt);
				
		//Afirmar
		assertTrue(ePalindromo);
		assertNotNull(txt);
	}
	
	@Test
	public void testaPalindromoFalse() {
		//Arrumar
		String txt = "girafa";
		boolean ePalindromo;
		
		//Agir
		ePalindromo = p.isPalindromo(txt);
				
		//Afirmar
		assertFalse(ePalindromo);
		assertNotNull(txt);
	}
}
