package contador;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ContadorTests {

	Contador contador;
	
	@Before
	public void setup() {
		contador = new Contador();
	}
	
	@After
	public void TearDown() {
		contador = null;
	}
	
	@Test
	public void creacion() {
		assertNotNull(contador);
	}

	@Test
	public void quePuedeContar() {
		contador.contar();
		assertEquals(1, contador.mostrar());
	}

	@Test
	public void queReiniciaSinHaberContado() {
		contador.reiniciar();
		assertEquals(0, contador.mostrar());
	}

	@Test
	public void queReiniciaLuegoDeContar() {
		contador.contar();

		contador.reiniciar();

		assertEquals(0, contador.mostrar());
	}
	
	@Test
	
	public void queCuenta50_000Veces() {
		for (int i = 0; i < 50_000; i++) {
			contador.contar();
		}
		 
		assertEquals(50_000, contador.mostrar());
	}

}
