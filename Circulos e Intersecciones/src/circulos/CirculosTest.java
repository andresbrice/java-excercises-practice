package circulos;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
@RunWith(value = Parameterized.class)

public class CirculosTest {
	@Parameters
	public static Iterable<Object[]> getData(){
		return Arrays.asList(new Object[][] {
			{0,0,1,1,1,1.5,true},{10,10,1,1,1,1.5,false},{2,2,5,5,1,2,true},
		});
	}
	
	private boolean expected;
	private double x0,x1,y0,y1,r0,r1;
	Circulo c1;
	Circulo c2;
	
	public CirculosTest(double x0, double y0, double r0, double x1, double y1, double r1,boolean expected) {
		this.x0 = x0;
		this.y0 = y0;
		this.x1 = x1;
		this.y1 = y1;
		this.r0 = r0;
		this.r1 = r1;
		this.expected = expected;
	}
	
	@Before
	public void setup() {
	 c1 = new Circulo(new Punto(x0, y0), r0);
	 c2 = new Circulo(new Punto(x1, y1), r1);
	}
	
	@Test
	public void hayInterseccion() {
		assertEquals(expected, c1.intersectaCon(c2));
		
		if(c1.intersectaCon(c2) == true) {
			System.out.println("Hay interseccion");
		}else {
			System.out.println("No hay interseccion");
		}
	}
	
}
