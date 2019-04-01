import java.util.Arrays;

public class Anagrama implements IAnagrama{

	@Override
	public boolean isAnagramas(String nome1, String nome2) {
		if(nome1 == "" || nome2 == "") {
			throw new NumberFormatException("Digite o texto");
		}
		char [] n1 = nome1.toCharArray();
		char [] n2 = nome2.toCharArray();
		Arrays.sort(n1);
		Arrays.sort(n2);
		if(Arrays.equals(n1, n2)) {
			return true;
		}else {
			return false;
		}
	}

}
