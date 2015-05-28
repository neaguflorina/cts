package test;

import static org.junit.Assert.*;

import org.junit.Test;

import proiect.RetetaObiect;

public class TestCost {

	
	@Test
	public void test() {
		
		RetetaObiect cost=new RetetaObiect();
		float rezultat=cost.costTotal(1, 8);
		assertTrue(rezultat== 8);
	}

}
