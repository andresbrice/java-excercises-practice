package test;

import static org.junit.Assert.*;

import org.junit.Test;

public class SumaCifrasTest {
	
	Sumacifra sumador;
	
	
	@before
	public void setUp() {
		sumador = new SumarCifras();
	}
	
	@after
	public void tearDown() {
		sumador = null;
	}
	@Test
	public void numeroDeUnaCifraDaMismoNumero() {
		int real = sumador.sumar(8);
		assertEquals(8,real);
	}
	
	

}
