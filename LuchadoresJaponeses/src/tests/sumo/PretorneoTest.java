package sumo;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class PretorneoTest {

  @Test
  public void test() {
    Pretorneo torneo = new Pretorneo(10);

    torneo.agregarUnLuchador(new Luchador(300,1500));
    torneo.agregarUnLuchador(new Luchador(320,1500));
    torneo.agregarUnLuchador(new Luchador(299,1580));
    torneo.agregarUnLuchador(new Luchador(330,1690));
    torneo.agregarUnLuchador(new Luchador(330,1540));
    torneo.agregarUnLuchador(new Luchador(339,1500));
    torneo.agregarUnLuchador(new Luchador(298,1700));
    torneo.agregarUnLuchador(new Luchador(344,1570));
    torneo.agregarUnLuchador(new Luchador(276,1678));
    torneo.agregarUnLuchador(new Luchador(289,1499));

    assertArrayEquals(new int[] {1,2,1,6,3,3,2,5,0,0}, torneo.calcularDominios());
  }

}