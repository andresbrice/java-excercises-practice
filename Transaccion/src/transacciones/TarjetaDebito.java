package transacciones;

public class TarjetaDebito extends Producto implements Comprable{
	public TarjetaDebito(Cuenta cuenta) {
		super(cuenta);
	}

	public void comprar(double monto) {
		this.cuenta.extraer(monto);
	}
}
