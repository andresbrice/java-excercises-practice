package sumacifras;

public class SumaCifra {
	public int sumar (int numero) {
		while (numero / 10 != 0) {
			numero = numero /10 + numero % 10 + (numero/10) %10; 
		}
		return numero;
	}
}
