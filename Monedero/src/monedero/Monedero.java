package monedero;

public class Monedero {
	private double dinero;
	
	public Monedero (double dineroInicial) { 						//constructor
		dinero = dineroInicial;
	}
	
	public void ingresarDinero (double cantidadAingresar) {
		dinero += cantidadAingresar;
	}
	
	public double sacarDinero(double cantidadAsacar) {
		if (dinero >= cantidadAsacar) {
			dinero -= cantidadAsacar;
			return cantidadAsacar;
		} else {
			return 0;
		}	
	}
	
	
	public double verCuantoDineroHay() {
		return dinero;
	}
	
	public static void main(String[] args) {
		Monedero monederoRosa = new Monedero (1200);
		double dineroDisponible = monederoRosa.verCuantoDineroHay();
		System.out.println(dineroDisponible);
		monederoRosa.sacarDinero(500);
		dineroDisponible = monederoRosa.verCuantoDineroHay();
		System.out.println(dineroDisponible);
		monederoRosa.ingresarDinero(500);
		dineroDisponible = monederoRosa.verCuantoDineroHay();
		System.out.println(dineroDisponible);
		monederoRosa.sacarDinero(1200);
		dineroDisponible = monederoRosa.verCuantoDineroHay();
		System.out.println(dineroDisponible);
		monederoRosa.sacarDinero(1200);
		dineroDisponible = monederoRosa.verCuantoDineroHay();
		System.out.println(dineroDisponible);
		monederoRosa.ingresarDinero(500);
		dineroDisponible = monederoRosa.verCuantoDineroHay();
		System.out.println(dineroDisponible);
		monederoRosa.sacarDinero(600);
		dineroDisponible = monederoRosa.verCuantoDineroHay();
		System.out.println(dineroDisponible);
		
		
		Monedero monederoAzul = new Monedero(1000);
		System.out.println(monederoAzul.verCuantoDineroHay());
	}
}

 