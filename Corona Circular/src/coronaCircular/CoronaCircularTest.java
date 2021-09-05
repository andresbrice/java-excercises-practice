package coronaCircular;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CoronaCircularTest {

	private CoronaCircular coronita;

    @Before
    public void setUp() throws Exception{
        coronita = new CoronaCircular(1,2);
    }

    @Test
    public void coronaTest() {
        assertEquals(1,coronita.getRadioInterno(),0.001);
        assertEquals(2,coronita.getRadioExterno(),0.001);
        assertEquals(9.4247,coronita.getSuperficie(),0.001);
        assertEquals(18.8495,coronita.getPermitero(),0.001);

    }

    @Test(expected = Error.class)
    public void radioInternoNegativoTest() {
        coronita = new CoronaCircular(-4,6);
    }
    
    @Test(expected = Error.class)
    public void radioExternoCeroTest() {
        coronita = new CoronaCircular(1,0);
    }
    
    @Test(expected = Error.class)
    public void radioInternoCeroTest() {
        coronita = new CoronaCircular(0,1);
    }

    @Test(expected = Error.class)
    public void radioExteriorNegativoTest() {
        coronita = new CoronaCircular(-4,-5);
    }

    @Test(expected = Error.class)
    public void radioInternoMayorExteriorTest() {
        coronita = new CoronaCircular(6,5);
    }

}
