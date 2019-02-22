
public class Calculadora implements ICalculadora{

	@Override
	public int somar(String v1, String v2) {
		int result = 0;
		result = Integer.parseInt(v1) + Integer.parseInt(v2);
		return result;
	}

	@Override
	public double dividir(String v1, String v2) {
		double result = 0;
		result = Double.parseDouble(v1) / Double.parseDouble(v2);
		return result;
	}

	@Override
	public double raizQuadrada(String v) {
		double valor = Double.parseDouble(v);
		double result = Math.pow(valor, 0.5);
		return result;
	}

}
