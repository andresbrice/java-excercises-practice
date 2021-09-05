package circulos;

public class Circulo {

	private double radio;
	private Punto punto;
	

	public Circulo(Punto punto, double radio) {
		this.radio = radio;
		this.punto = punto;
	}

	public boolean intersectaCon(Circulo circulo) {
		double x0 = this.punto.getX();
		double x1 = circulo.punto.getX();
		double y0 = this.punto.getY();
		double y1 = circulo.punto.getY();
		double r0 = this.radio;
		double r1 = circulo.radio;
		
		return Math.hypot(x0-x1, y0-y1) <= (r0 + r1);
		
	}
}
