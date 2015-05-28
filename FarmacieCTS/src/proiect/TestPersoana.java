package proiect;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestPersoana {

	@Test
	public void testSetNume() {
		PersoanaObiect pers = new PersoanaObiect();
        pers.setNume("Neagu");
        assertTrue(pers.getNume() == "Neagu");
	}
     @Test
    public void testSetPrenume() {
    PersoanaObiect pers1 = new PersoanaObiect();
    pers1.setPrenume("Florina");
    assertTrue(pers1.getPrenume() == "Florina");
     }
     @Test
 	public void testSetVarsta() {
 		PersoanaObiect pers = new PersoanaObiect();
         pers.setVarsta(20);
         assertTrue(pers.getVarsta() == 20);
     }
        
     @Test
 	public void testGetNume() {
 		PersoanaObiect pers = new PersoanaObiect("Petre","Florin",31);
         pers.getNume();
         assertTrue(pers.getNume() == "Petre");
 	}
     @Test
 	public void testGetPrenume() {
 		PersoanaObiect pers = new PersoanaObiect("Petre", "Florin",31);
         pers.getPrenume();
         assertTrue(pers.getPrenume() == "Florin");
 	}
     
     @Test
 	public void testGetVarstae() {
 		PersoanaObiect pers = new PersoanaObiect("Petre","Florin",31);
         pers.getVarsta();
         assertTrue(pers.getVarsta() == 31);
         
 	}
}