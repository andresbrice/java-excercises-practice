package ponyexpress;

public class Recorrido {
	private int caballos;

	public Recorrido() {
		this.caballos = 1;
	}

	public int caballos(int[] distancias) {
		int millas = 0;

		if (distancias.length < 1) {
			throw new IllegalArgumentException("No se acepta un array vacio");
		}
		
		for (int i = 0; i < distancias.length; i++) {
			if (distancias[i] <= 0) {
				throw new IllegalArgumentException("Las distancias deben ser números positivos mayores a 1");
			}
		}

		for (int i = 0; i < distancias.length; i++) {
			if ((distancias[i]) + millas <= 100) { 
				millas = millas + (distancias[i]); 
			} else {
				millas = 0;
				caballos++;
			}
		}

		return caballos;
	}
}
