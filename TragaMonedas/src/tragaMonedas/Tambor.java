package tragaMonedas;

public class Tambor {
	private int posicion;
	
	public Tambor() {
		posicion = 1;
	}
	
	public int getPosicion() {
		return posicion;
	}
	
	public void girar() {
		double random = Math.random();
		posicion = (int)(random * 8) + 1;
	}
	
}
