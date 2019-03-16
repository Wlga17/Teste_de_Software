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
	
	@Test
	public void testaMenorValorColecaoOrdemCrescente() {
		//Arrumar
		Collection<String> col = new ArrayList<String>();
		col.add("2");
		col.add("3");
		col.add("4");
		
		//Agir
		o.inserirColecao(col);
		
		//Afirmar
		assertNotEquals(3, o.getMenorValor());
	}
	
	@Test
	public void testaMenorValorColecaoOrdemDecrescente() {
		//Arrumar
		Collection<String> col = new ArrayList<String>();
		col.add("4");
		col.add("3");
		col.add("2");
				
		//Agir
		o.inserirColecao(col);
				
		//Afirmar
		assertNotEquals(3, o.getMenorValor());
	}
	
	@Test(expected=NumberFormatException.class)
	public void testaMenorValorColecaoComNulo() {
		//Arrumar
		Collection<String> col = new ArrayList<String>();
		col.add("");
		col.add("2");
		col.add("");
				
		//Agir
		o.inserirColecao(col);
				
		//Afirmar
		assertNotEquals(3, o.getMenorValor());
	}
	
	@Test
	public void testaValorMedioDaColecao() {
		//Arrumar
		Collection<String> col = new ArrayList<String>();
		col.add("2");
		col.add("5");
		col.add("3");
				
		//Agir
		o.inserirColecao(col);
				
		//Afirmar
		assertNotEquals(4, o.getValorMedio());
	}

	@Test(expected=NumberFormatException.class)
	public void testaValorMedioDaColecaoComNulo() {
		//Arrumar
		Collection<String> col = new ArrayList<String>();
		col.add("");
		col.add("5");
		col.add("3");
						
		//Agir
		o.inserirColecao(col);
						
		//Afirmar
		assertNotEquals(4, o.getValorMedio());
	}
	
	@Test
	public void testaValorMedianaDaColecaoPar() {
		//Arrumar
		Collection<String> col = new ArrayList<String>();
		col.add("2");
		col.add("5");
		col.add("3");
		col.add("4");
						
		//Agir
		o.inserirColecao(col);
						
		//Afirmar
		assertNotEquals(2, o.getValorMediana());
	}
	
	@Test
	public void testaValorMedianaDaColecaoImpar() {
		//Arrumar
		Collection<String> col = new ArrayList<String>();
		col.add("2");
		col.add("5");
		col.add("3");
						
		//Agir
		o.inserirColecao(col);
						
		//Afirmar
		assertNotEquals(4, o.getValorMediana());
	}
	
	@Test(expected=NumberFormatException.class)
	public void testaValorMedianaDaColecaoComNulo() {
		//Arrumar
		Collection<String> col = new ArrayList<String>();
		col.add("");
		col.add("5");
		col.add("3");
		col.add("");
		
		//Agir
		o.inserirColecao(col);
						
		//Afirmar
		assertNotEquals(6, o.getValorMediana());
	}
}
