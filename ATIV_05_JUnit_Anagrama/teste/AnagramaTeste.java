import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AnagramaTeste {

	private Anagrama a;
	private boolean eAnagrama;
	
	@Before
	public void criarObjeto() {
		this.a = new Anagrama();
	}
	
	@Test
	public void anagramaTrueTest1() {
		//Arrumar
		String nome1 = "amor";
		String nome2 = "roma";
		
		//Agir
		eAnagrama = a.isAnagramas(nome1, nome2);
		
		//Afirmar
		assertTrue(eAnagrama);
	}
	
	@Test
	public void anagramaTrueTest2() {
		//Arrumar
		String nome1 = "moça";
		String nome2 = "maço";
		
		//Agir
		eAnagrama = a.isAnagramas(nome1, nome2);
		
		//Afirmar
		assertTrue(eAnagrama);
	}
	
	@Test
	public void anagramaFalseTest() {
		//Arrumar
		String nome1 = "pedra";
		String nome2 = "pao";
		
		//Agir
		eAnagrama = a.isAnagramas(nome1, nome2);
		
		//Afirmar
		assertFalse(eAnagrama);
	}
	
	@Test(expected=NumberFormatException.class)
	public void anagramaComValorVazioTest() {
		//Arrumar
		String nome1 = "pedra";
		String nome2 = "";
		
		//Agir
		eAnagrama = a.isAnagramas(nome1, nome2);
		
		//Afirmar
		assertFalse(eAnagrama);
	}
	
	@Test
	public void anagramaComNumeroTest() {
		//Arrumar
		String nome1 = "123";
		String nome2 = "222";
		
		//Agir
		eAnagrama = a.isAnagramas(nome1, nome2);
		
		//Afirmar
		assertFalse(eAnagrama);
	}
	
	@After
	public void destruirObjeto() {
		a = null;
	}
}
