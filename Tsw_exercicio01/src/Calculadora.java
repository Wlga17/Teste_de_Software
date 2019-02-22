
public class Calculadora implements ICalculadora{

	@Override
	public int somar(String v1, String v2) {
		int result = 0;
		int valor1 = Integer.parseInt(v1);
		int valor2 = Integer.parseInt(v2); 
		if(v1 == "" || v2 == "") {
			throw new RuntimeException("Não é possivel somar sem dois valores");
		}
		result = valor1 + valor2;
		return result;
	}

	@Override
	public double dividir(String v1, String v2) {
		double result = 0;
		double valor1 = Double.parseDouble(v1);
		double valor2 = Double.parseDouble(v2);
		if(v1 == "" || v2 == "") {
			throw new RuntimeException("Não é possivel dividir sem dois valores");
		}
		result = valor1 / valor2;
		return result;
	}

	@Override
	public double raizQuadrada(String v) {
		double valor = Double.parseDouble(v);
		if(v == "") {
			throw new RuntimeException("Não é possivel fazer a raiz quadrada sem valor");
		}
		double result = Math.pow(valor, 0.5);
		return result;
	}

}
