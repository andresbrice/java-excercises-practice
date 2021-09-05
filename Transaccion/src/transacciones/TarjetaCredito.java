package transacciones;

public class TarjetaCredito extends Producto implements Comprable {

	private double montoAPagar;
	private static final double COMISION = 0.03;



	public TarjetaCredito(Cuenta cuenta, double gastoAdministrativo) {
		super(cuenta);
	}

	@Override
	public void comprar(double monto) {
		this.montoAPagar += monto;
	}
	
	
	public void pagar() {
		this.cuenta.extraer(this.montoAPagar + this.montoAPagar * COMISION);
	}

}
