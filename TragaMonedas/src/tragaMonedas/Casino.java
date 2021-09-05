package tragaMonedas;

public class Casino {
	private static final int PREMIO = 50;
	
	private TragaMonedas[] tragamonedas;
	
	public Casino(int cantidadDeTragaMonedas) {
		
		tragamonedas = new TragaMonedas[cantidadDeTragaMonedas];
		
		for (int i = 0; i < cantidadDeTragaMonedas; i++) {
			tragamonedas[i] = new TragaMonedas(); 
		}
	}
	
	public void simularhastaQueSalgaPremioEnTodos() {
		for (TragaMonedas cT : tragamonedas) {
			int cantidadDeJugadas = cT.simularHastaQueSalgaPremio();
			
			System.out.println("El jugador recibe " + PREMIO + " monedas");
			System.out.println("Jugó " + cantidadDeJugadas + " monedas");
			System.out.println();
		}
	}
	
	public void cuantosPremiosEntregaEnNgirosEnTodos(int n) {
		for (TragaMonedas cT : tragamonedas) {
			int cantidadDePremios = cT.cuantosPremiosEntregaEnNgiros(n);
			
			System.out.println("El jugador obtiene " + cantidadDePremios + " premios y recibe " + cantidadDePremios * PREMIO + " monedas");
			System.out.println("Jugó " + n + " monedas");
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Casino royal = new Casino (20);
		
		royal.cuantosPremiosEntregaEnNgirosEnTodos(50);
		
		System.out.println(" - - - - - - - - - - - - - - - - - - - - - - - - ");
		royal.simularhastaQueSalgaPremioEnTodos();
	}
	
}
