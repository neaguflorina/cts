package proiect;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestReteta {

	@Test
	public void testGetSerie() {
		
			RetetaObiect reteta = new RetetaObiect("px","1236", 156,165);
	        reteta.getSerie();
	        assertTrue(reteta.getSerie() == "px");
		
	}
	@Test
	public void testGetNumar() {
		
		RetetaObiect reteta = new RetetaObiect("px","1236", 156,458);
        reteta.getNumar();
        assertTrue(reteta.getNumar() == "1236");

}
	
	/*@Test
	public void testGetValoare() {
		
		RetetaObiect reteta = new RetetaObiect("px","1236",15,458);
        reteta.getCantitate();
        assertTrue(reteta.getCantitate() == 15);*/

	//}
	@Test
	public void testSetValoare() {

		RetetaObiect reteta = new RetetaObiect();
        reteta.setPret(30);
        assertTrue(reteta.getPret() == 30);
	
	}
	@Test
	public void testSetSerie() {
		
		RetetaObiect reteta = new RetetaObiect();
        reteta.setSerie("px");
        assertTrue(reteta.getSerie() == "px");
	}
	@Test
	public void testSetNumar() {
		
		RetetaObiect reteta = new RetetaObiect();
        reteta.setNumar("156");
        assertTrue(reteta.getNumar() == "156");
	}
	
}

