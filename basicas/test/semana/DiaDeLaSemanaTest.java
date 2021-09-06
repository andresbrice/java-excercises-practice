package semana;

import org.junit.Test;

import static org.junit.Assert.*;

public class DiaTest {
    @Test
    public void test() {
        Dia x = Dia.LUNES;

        assertEquals("Lun", x.getAbbr());

        assertTrue(Dia.LUNES.anteriorA(Dia.MARTES));

        assertEquals(Dia.MARTES, x.manana());
    }
}