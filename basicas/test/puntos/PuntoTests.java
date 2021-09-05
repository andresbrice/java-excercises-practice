package puntos;

import static org.junit.Assert.*;

import org.junit.Test;

import java.util.Arrays;

public class PuntoTests {

	@Test
	public void toStringEnPunto() {
		Punto punto = new Punto(3, 4);
		assertEquals("(3.0, 4.0)", punto.toString());
	}

	@Test
	public void quePuedoClonar() throws CloneNotSupportedException {
		Punto punto = new Punto(3, 4);
		Punto clon = (Punto) punto.clone();

		assertNotSame(punto, clon);
		assertEquals(punto,clon);

		//assertEquals(punto.x, clon.x, 0); // no olvidar que cuando comparo variables de tipo double
		//assertEquals(punto.y, clon.y, 0); // agregar un parametro epsilon (distancia entre valor x
											// de uno y el valor x de otro)

	}

	@Test
	public void equals() {
		Punto uno = new Punto(3, 4);
		Punto dos = new Punto(3, 4);
		Punto tres = new Punto(3, 4);
		Punto cuatro = new Punto(5, 6);

		// reflexividad
		assertEquals(uno, uno);

		// simetria
		assertEquals(uno, dos);
		assertEquals(dos, uno);

		// transitividad
		assertEquals(uno, dos);
		assertEquals(dos, tres);
		assertEquals(tres, uno);

		// falsedad ante null
		assertNotEquals(uno, null);

		// distintos
		assertNotEquals(uno, cuatro);
	}
	
	@Test
	public void testHashCode() {
		Punto uno = new Punto(3, 4);
		Punto dos = new Punto(3, 4);
		Punto cuatro = new Punto(5, 6);
		
		System.out.println(uno.hashCode());
		System.out.println(dos.hashCode());
		System.out.println(cuatro.hashCode());
		//consistencia ante la igualdad
		assertEquals(uno, dos);
		assertEquals(uno.hashCode(), dos.hashCode());
		
		assertNotEquals(uno.hashCode(), cuatro.hashCode());
	}

	@Test
	public void modulo(){
		Punto uno = new Punto(3, 4);
		assertEquals(5.0, uno.getModulo(),0);

		Punto dos = new Punto(-3, -4);
		assertEquals(5.0, dos.getModulo(),0);
	}

	@Test
	public void compareTo(){
		Punto uno = new Punto(3, 4);
		Punto dos = new Punto(4, 5);
		Punto tres = new Punto(3, 4);

		assertTrue(uno.compareTo(dos) < 0);
		assertTrue(dos.compareTo(uno) > 0);
		assertEquals(0, uno.compareTo(tres));

	}
	
	@Test
	public void ordenar(){
		Punto[] puntos = {
				new Punto(4,5),
				new Punto(1,1),
				new Punto(2,3),
				new Punto (0,0),
		};

		System.out.println(Arrays.toString(puntos));
		Arrays.sort(puntos);
		System.out.println(Arrays.toString(puntos));
	}

	@Test
	public void ordenarDos(){
		Punto[] puntos = {
				new Punto(4,5),
				new Punto(1,1),
				new Punto(2,3),
				new Punto (0,0),
		};

		System.out.println(Arrays.toString(puntos));
		Arrays.sort(puntos, new ComparadorPorModulo());
		System.out.println(Arrays.toString(puntos));
	}

	@Test
	public void ordenarTres(){
		Punto[] puntos = {
				new Punto(4,5),
				new Punto (0,0),
				new Punto(-2,3),
				new Punto(1,1),
		};

		System.out.println(Arrays.toString(puntos));
		Arrays.sort(puntos, new ComparadorPorEquis());
		System.out.println(Arrays.toString(puntos));
	}

	@Test
	public void ordenarCuatro(){
		Punto[] puntos = {
				new Punto(4,5),
				new Punto (0,0),
				new Punto(-2,3),
				new Punto(1,1),
		};

		System.out.println(Arrays.toString(puntos));
		Arrays.sort(puntos, new ComparadorPorEquisDecreciente());
		System.out.println(Arrays.toString(puntos));
	}
}
