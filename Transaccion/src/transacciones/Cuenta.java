package transacciones;

import java.util.Arrays;

public class Cuenta {
	protected double saldo = 0;
	private int cantidadTransaccion;
	private Transaccion[] transacciones;
	private static final int DEFAULT_TRANSACCIONES = 10;
	
	public Cuenta(int transaccionesPosibles) {
		this.transacciones = new Transaccion[transaccionesPosibles];
	}
	
	public Cuenta() {
		this(DEFAULT_TRANSACCIONES);
	}

	public void depositar(double aDepositar) {
		if (aDepositar > 0) {
			this.saldo += aDepositar;
		}
		transacciones[this.cantidadTransaccion] = new Transaccion(aDepositar, MotivoTransaccion.DEPOSITO,this, this);
		this.cantidadTransaccion++;
	}

	public void extraer(double aRetirar) {
		if (this.montoValido(aRetirar)) {
			this.saldo -= aRetirar;
		} else {
			throw new Error("Monto Invalido");
			transacciones[this.cantidadTransaccion] = new Transaccion(aRetirar, MotivoTransaccion.EXTRACCION,this, this);
			this.cantidadTransaccion++;
		}
	}

	public void transferir(double monto, Cuenta destino) {
		double saldoInicial = this.saldo;
		this.extraer(monto);
		
		if (saldoInicial == this.saldo) {
			throw new Error ("El monto es invalido");
		}else {
			destino.depositar(monto);
		}	
		
		transacciones[this.cantidadTransaccion] = new Transaccion (monto, MotivoTransaccion.TRANSFERENCIA,this,destino);
		this.cantidadTransaccion++;
	}
	
	protected boolean montoValido(double monto) {
		return (monto <= this.saldo && monto > 0);
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public void OrdenarProMotivo() {
		Arrays.sort(this.);
	}
	
	
	
}
