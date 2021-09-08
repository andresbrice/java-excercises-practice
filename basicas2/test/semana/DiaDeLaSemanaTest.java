package semana;

import org.junit.Test;

import static org.junit.Assert.*;

public class DiaDeLaSemanaTest {
    @Test
    public void test() {
        DiaDeLaSemana x = DiaDeLaSemana.LUNES;

        assertEquals("Lun", x.getAbbr());

        assertTrue(DiaDeLaSemana.LUNES.anteriorA(DiaDeLaSemana.MARTES));

        assertEquals(DiaDeLaSemana.MARTES, x.manana());
    }
}