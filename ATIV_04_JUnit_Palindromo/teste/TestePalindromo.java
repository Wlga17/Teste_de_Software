import static org.junit.Assert.assertFalse;
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
		
		//Agir
		p.isPalindromo(txt);
		
		//Afirmar
		assertNull(txt);
	}
	
	@Test
	public void testaPalindromoTrue() {
		//Arrumar
		String txt = "Arara";
				
		//Agir
		p.isPalindromo(txt);
				
		//Afirmar
		assertTrue(true);
	}
	
	@Test
	public void testaPalindromoFalse() {
		//Arrumar
		String txt = "Girafa";
				
		//Agir
		p.isPalindromo(txt);
				
		//Afirmar
		assertFalse(false);
	}
}
