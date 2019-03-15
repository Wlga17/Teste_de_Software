import static org.junit.Assert.assertEquals;

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
		Collection<String> col = new ArrayList<String>();
		o.inserirColecao(col);

	}
	
	@Test(expected=NumberFormatException.class)
	public void testaColecaoVazia() {
		Collection<String> col = new ArrayList<String>();
		col.add("");
		col.add("");
		o.inserirColecao(col);
	}
	
	@Test
	public void testaColecaoComValor() {
		Collection<String> col = new ArrayList<String>();
		col.add("5");
		col.add("7");
		o.inserirColecao(col);
	}
	
}
