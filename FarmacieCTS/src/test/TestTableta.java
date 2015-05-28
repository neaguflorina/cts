package test;

import static org.junit.Assert.*;

import org.junit.Test;

import proiect.Medicament;

public class TestTableta {

	@Test
	public void test() {
		
		Medicament med=new Medicament();
		int rez=med.masuraTableta(10,15);
		assertTrue(rez==150);
	}

}
