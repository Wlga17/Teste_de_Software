package entidade;

public class RaizQuadrada implements IRaizQuadrada{

	@Override
	public double isRaizQuadrada(String numero) {
		if(numero == "")	{
			throw new NumberFormatException("Digite o valor! ");
		}
		if(numero.matches("[A-Z a-z]*"))	{
			throw new NumberFormatException("Digite apenas n�mero! ");
		}
		
		double resultado;
		double valor = Double.parseDouble(numero);
		
		if(valor < 0)	{
			throw new NumberFormatException("Digite apenas n�mero positivo! ");
		}
		resultado = Math.sqrt(valor);
		return resultado;
		
	}

}
