
public class Palindromo implements IPalindromo{

	@Override
	public boolean isPalindromo(String texto) {
		String txtInvertido = new StringBuffer(texto).reverse().toString();
		if(texto == "") {
			throw new NumberFormatException("Digite o texto");
		}
		if(texto.equals(txtInvertido)) {
			return true;
		}else {
			return false;
		}
	}

}
