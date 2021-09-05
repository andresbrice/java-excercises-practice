package transacciones;

import java.util.Date;

public class Transaccion implements Comparable<Transaccion> {
	private double monto;
	private MotivoTransaccion motivo;
	private Date fecha;
	private Cuenta origen;
	private Cuenta destino;
	
	public Transaccion(double monto, MotivoTransaccion motivo, Cuenta origen, Cuenta destino) {
		this.monto = monto;
		this.motivo = motivo;
		this.fecha = new Date();
		this.origen = origen;
		this.destino = destino;
	}

	@Override
	public int compareTo(Transaccion o) {
		return 0;
	}
	
	public Double getMonto() {
		return this.monto;
	}


	
	
	
}
