package tragaMonedas;

public class TragaMonedas {
	private Tambor tamborIzquierdo;
	private Tambor tamborMedio;
	private Tambor tamborDerecho;
	
	public TragaMonedas() {
		tamborIzquierdo = new Tambor();
		tamborMedio = new Tambor();
		tamborDerecho = new Tambor();
	}
	
	public void activar() {
		this.tamborIzquierdo.girar();
		this.tamborMedio.girar();
		this.tamborDerecho.girar();
	}
	
	public boolean entregaPremio() {
	 return (this.tamborIzquierdo.getPosicion() == this.tamborMedio.getPosicion() 
			 && this.tamborMedio.getPosicion() == this.tamborDerecho.getPosicion());
	}
	
	public String toString() {
		return "[" + this.tamborIzquierdo.getPosicion() + "]" + 
			   "[" + this.tamborMedio.getPosicion() + "]" + 
			   "[" + this.tamborDerecho.getPosicion() + "]";
	}
	
	public int simularHastaQueSalgaPremio() {
		int cantidadDeIntentos = 0;
		this.activar();
		
		while (!this.entregaPremio()) {
			cantidadDeIntentos++;
			this.activar();
		}
		
		System.out.println(this);
		
		return cantidadDeIntentos;
	}
	
	public int cuantosPremiosEntregaEnNgiros(int n) {
		int cantidadDeAciertos = 0;
		for (int i = 1 ; i <= n ; i++) {
			this.activar();
			if(this.entregaPremio()) {
				System.out.println(this);
				cantidadDeAciertos++;				
			}
		}
		return cantidadDeAciertos;
	}

}
