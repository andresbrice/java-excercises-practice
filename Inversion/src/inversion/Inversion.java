package inversion;

public class Inversion {

	private double monto;
	private double interes;
	private int cantidadanios;

	public Inversion(double monto, double interes, int cantidadanios) {
		this.monto = monto;
		this.interes = interes;
		this.cantidadanios = cantidadanios;
	}

	public double getMonto() {
		return monto;
	}

	public double getInteres() {
		return interes;
	}

	public int getCantidadanios() {
		return cantidadanios;
	}

	public double[] calcularInversion() {
		double interesMensual = this.interes/12;
		double[] salida = new double[this.cantidadanios];
		double acumulador = 0;

		for (int i = 0; i < salida.length; i++) {
			for (int j = 0; j < 12; j++) {
				if (i == 0 && j == 0) {
					acumulador += this.monto + (this.monto * interesMensual);
				} else {
					acumulador += acumulador * interesMensual;
				}
			}
			//salida[i] = (double)Math.round(acumulador*10000d)/10000d;
			System.out.println((double)Math.round(acumulador*10000d)/10000d);
		}
		return salida;
	}

}
