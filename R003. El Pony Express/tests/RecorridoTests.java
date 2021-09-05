import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import ponyexpress.Recorrido;

public class RecorridoTests {

	Recorrido r1;
	Recorrido r2;
	Recorrido r3;
	Recorrido r4;
	Recorrido r5;

	@Before
	public void setup() {
		r1 = new Recorrido();
		r2 = new Recorrido();
		r3 = new Recorrido();
		r4 = new Recorrido();
		r5 = new Recorrido();
	}

	@Test
	public void test() {
		Assert.assertEquals(1, r1.caballos(new int[] { 18, 15 }));
		Assert.assertEquals(2, r2.caballos(new int[] { 43, 23, 40, 13 }));
		Assert.assertEquals(3, r3.caballos(new int[] { 33, 8, 16, 47, 30, 30, 46 }));
		Assert.assertEquals(2, r4.caballos(new int[] { 51, 51, 51 }));
		Assert.assertEquals(4, r5.caballos(new int[] { 6, 24, 6, 8, 28, 8, 23, 47, 17, 29, 37, 18, 40, 49 }));
	}

	@Test(expected = IllegalArgumentException.class)
	public void caballosCuandoArraySeaVacio() {
		int[] distancias = {};
		r1.caballos(distancias);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void caballosCuandoHayaNumeroNegativoEnArray() {
		int[] distancias = {18, -15};
		r1.caballos(distancias);
	}
}
