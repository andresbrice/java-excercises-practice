package palindromos;

public class Palindromo {
	public static boolean esPalindromo(final String frase) {
		
		String tmp = frase.toLowerCase();
		tmp = tmp.replaceAll("á","a");
		tmp = tmp.replaceAll("\\W", "");
		// String tmp = frase.replaceAll(" ","");
		// tmp = tmp.replaceAll(",","");		
		
		for (int i = 0; i < tmp.length() / 2 ; i++) {
			char izquierda = tmp.charAt(i);
			char derecha = tmp.charAt(tmp.length() - 1 - i);
			if (izquierda != derecha) {
				return false;
			}
		}
		return true;
	}
}
