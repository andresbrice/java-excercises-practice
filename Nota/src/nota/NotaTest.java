package nota;

import static org.junit.Assert.*;

import org.junit.Test;

public class NotaTest {

	@Test
	public void inicializacionTest() {
		Nota nota = new Nota(4);
		assertNotNull(nota);
	}
	
	@Test
	public void obtenerValorTest() {
		Nota nota = new Nota(4);
		int esperado = 4;
		int obtenido = nota.obtenerValor();
		assertEquals(esperado,obtenido);
	}
	
	@Test
	public void aprobado4Test() {
		Nota nota = new Nota(4);
		assertTrue(nota.aprobado());
	}
	
	@Test
	public void aprobado10Test() {
		Nota nota = new Nota(10);
		assertTrue(nota.aprobado());
		assertFalse(nota.desaprobado());
	}
	
	@Test
	public void desaprobado3Test() {
		Nota nota = new Nota(3);
		assertTrue(nota.desaprobado());
		assertFalse(nota.aprobado());
	}
	
	@Test
	public void desaprobado0Test() {
		Nota nota = new Nota(0);
		assertTrue(nota.desaprobado());
		assertFalse(nota.aprobado());
	}
	
	@Test
	public void recuperaYSubeNotaTest() {
		Nota nota = new Nota(3);
		assertTrue(nota.desaprobado());
		nota.recuperar(8);
		assertEquals(8,nota.obtenerValor());
		assertTrue(nota.aprobado());
		
	}
	
	@Test
	public void recuperaYNoSubeNotaTest() {
		Nota nota = new Nota(5);
		nota.recuperar(2);
		assertEquals(5,nota.obtenerValor());
		assertTrue(nota.aprobado());
		
	}
	
	@Test(expected = Error.class)
	public void valorIncorrectoTest() {
		Nota nota = new Nota(15);
	}

}
