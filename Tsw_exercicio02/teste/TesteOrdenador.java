import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;

public class TesteOrdenador {

	private Ordenador o;
	
	@Before
	public void criarObjeto() {
		this.o = new Ordenador();
	}
	
	@Test(expected=NumberFormatException.class)
	public void testaColecaoNula() {
		//Arrumar
		Collection<String> col = new ArrayList<String>();
		
		//Agir
		o.inserirColecao(col);
		
		//Afirmar
		assertNull(col);
	}
	
	@Test(expected=NumberFormatException.class)
	public void testaColecaoVazia() {
		//Arrumar
		Collection<String> col = new ArrayList<String>();
		col.add("");
		col.add("");
	
		//Agir
		o.inserirColecao(col);
		
		//Afirmar
		assertNull(col);
	}
	
	@Test
	public void testaColecaoComValor() {
		//Arrumar
		Collection<String> col = new ArrayList<String>();
		col.add("5");
		col.add("7");
		
		//Agir
		o.inserirColecao(col);
		
		//Afirmar
		assertNotNull(col);
	}
	
	@Test
	public void testaMaiorValorColecaoOrdemCrescente() {
		//Arrumar
		Collection<String> col = new ArrayList<String>();
		col.add("2");
		col.add("3");
		col.add("5");
		String valor = "5";
		
		//Agir
		o.inserirColecao(col);
		o.informarValor(valor);
		
		//Afirmar
		assertNotEquals(4, o.getMaiorValor());
	}
	
	@Test
	public void testaMaiorValorColecaoOrdemDecrescente() {
		//Arrumar
		Collection<String> col = new ArrayList<String>();
		col.add("5");
		col.add("3");
		col.add("2");
		String valor = "5";
				
		//Agir
		o.inserirColecao(col);
		o.informarValor(valor);
				
		//Afirmar
		assertNotEquals(4, o.getMaiorValor());
	}
	
	@Test(expected=NumberFormatException.class)
	public void testaMaiorValorInformandoValorVazio() {
		//Arrumar
		Collection<String> col = new ArrayList<String>();
		col.add("5");
		col.add("3");
		col.add("2");
		String valor = "";
						
		//Agir
		o.inserirColecao(col);
		o.informarValor(valor);
						
		//Afirmar
		assertNotEquals(4, o.getMaiorValor());
	}
}
