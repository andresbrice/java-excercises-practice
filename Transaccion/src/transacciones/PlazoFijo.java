package transacciones;

public class PlazoFijo extends Producto implements Comprable {

	private double monto;
	private static final double INTERES_ANUAL = 0.36;

	public PlazoFijo(Cuenta cuenta, double monto) {
		super(cuenta);
		this.monto = cuenta.getSaldo();
		cuenta.extraer(cuenta.getSaldo());
	}

	public void acreditar() {
		cuenta.depositar(this.monto - this.monto * (INTERES_ANUAL / 12));
	}

}
