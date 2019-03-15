import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Ordenador {
	
	private Double maiorValor ;
	private Double menorValor;
	private Double valorMedio;
	private Double valorMediana;
	
	public Ordenador() {
		// TODO Auto-generated constructor stub
	}

	public void inserirColecao(Collection<String> pColecao) {
		List<String> colecao = new ArrayList<String>();
		String maiorValor = "0";
		String menorValor = "99999";
		String valorMeio = "0";
		String valorMeio1 = "0";
		String valorMeio2 = "0";
		
		int contador = 0;
		double somaValor = 0;
		
		for(String valor : pColecao) {
			if(Double.parseDouble(valor) > Double.parseDouble(maiorValor)) {
				maiorValor = valor;
				this.maiorValor = Double.parseDouble(maiorValor);
			}
			if(Double.parseDouble(valor) < Double.parseDouble(menorValor)) {
				menorValor = valor;
				this.menorValor = Double.parseDouble(menorValor);
			}
			somaValor = somaValor + Double.parseDouble(valor);
			colecao.add(valor);
		}
		contador = colecao.size();
		valorMeio1 = colecao.get((contador / 2) - 1);
		valorMeio2 = colecao.get((contador / 2));
		this.valorMedio = somaValor / contador;
		if((contador % 2) == 0) {
			this.valorMediana = (Double.parseDouble(valorMeio1) + Double.parseDouble(valorMeio2)) / 2;			 
		}else {
			valorMeio = colecao.get(contador/2);
			this.valorMediana = Double.parseDouble(valorMeio);
		}
		
	}
	
	public void informarValor(String pValor) {
		if(Double.parseDouble(pValor) > this.maiorValor) {
			this.maiorValor = Double.parseDouble(pValor);
		}
	}
	
	public Double getMaiorValor() {
		return maiorValor;
	}

	public Double getMenorValor() {
		return menorValor;
	}

	public Double getValorMedio() {
		return valorMedio;
	}

	public Double getValorMediana() {
		return valorMediana;
	}
	
}
