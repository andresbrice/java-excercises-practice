package transacciones;

import java.util.Comparator;

public class OrdenarPorMonto implements Comparator <Transaccion>{

	@Override
	public int compare(Transaccion o1, Transaccion o2) {
		return o1.getMonto().compareTo(o2.getMonto());
	}

}
