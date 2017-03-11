package yazilimGelistirme.com.medipol.odev1;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ChamberTest {

	@Test
    public void shouldChamberInputs() {

        final Chamber chamber = new Chamber();

        float response = chamber.chamber(2,4);
        assertTrue(response == 0.5);

    }


    @Test
    public void shouldChamberInputsWithParams() {

        final Chamber chamber = new Chamber();

        float response = chamber.chamber(10, 5);
        assertTrue(response == 2);

    }
    

}
