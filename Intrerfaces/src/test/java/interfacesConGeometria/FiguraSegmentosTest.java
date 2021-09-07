package interfacesConGeometria;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class FiguraSegmentosTest {

  private static Circulo circulo;
  private static Cuadrado cuadrado;
  private static Segmento s1;
  private static Segmento s2;
  private static Figura circuloFigura;
  private static Figura cuadradoFigura;

  @BeforeClass
  public static void beforeClass() throws Exception {
    circulo = new Circulo(new Punto(-1, -1), 3);
    cuadrado = new Cuadrado(new Punto(-2, 2), (double) 4);
    circuloFigura = new Circulo(new Punto(2, 2), 3.5);
    cuadradoFigura = new Cuadrado(new Punto(2, -2), (double) 3);
    s1 = new Segmento(new Punto(-5, 0), new Punto(-5, -10));
    s2 = new Segmento(new Punto(0, -5), new Punto(5, -5));
  }

  @Test
  public void segmentosOrdenadosTest() {
    Segmento[] segmentos = {s1, s2};
    Arrays.sort(segmentos);
    Segmento[] esperado = {s2, s1};
    assertArrayEquals(esperado, segmentos);
  }


  @Test
  public void segmentosParalelosTest() {
    Segmento s3 = new Segmento(new Punto(1, 2), new Punto(4, 5));
    Segmento s4 = new Segmento(new Punto(-1, 2), new Punto(2, 5));

    assertFalse(s1.esParalelo(s2));
    assertFalse(s2.esParalelo(s1));
    assertTrue(s1.esParaleloY());
    assertTrue(s2.esParaleloX());
    assertTrue(s3.esParalelo(s4));
    assertTrue(s4.esParalelo(s3));
  }

  @Test
  public void figurasOrdenadasTest() {
    Figura[] figuras = {circulo, cuadrado, circuloFigura, cuadradoFigura};
    Arrays.sort(figuras);
  }

  @Test
  public void desplazablesTest() {
    Segmento s3 = new Segmento(new Punto(1, 2), new Punto(4, 5));
    Segmento s4 = new Segmento(new Punto(-1, 2), new Punto(2, 5));
    Segmento s1Desplazado = new Segmento(new Punto(-4, 1), new Punto(-4, -9));
    Punto punto = new Punto(0, 0);
    Figura cuadradoFiguraDesplazado = new Cuadrado(new Punto(3, -1), (double) 3);

    Desplazable[] desplazables = {circulo, circuloFigura, cuadrado, cuadradoFigura, s1, s2, s3, s4, punto};

    for (Desplazable d : desplazables) {
      d.desplazar(1, 1);
    }

    assertEquals(new Punto(1, 1), punto);
    assertEquals(cuadradoFiguraDesplazado, cuadradoFigura);
    assertEquals(s1,s1Desplazado);
  }
}