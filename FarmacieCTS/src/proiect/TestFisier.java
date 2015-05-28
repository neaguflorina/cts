package proiect;

import static org.junit.Assert.*;

import java.io.File;

import org.junit.Test;

public class TestFisier {

	

	public class UtilizatorFisierTest {

		@Test
		public void test1() {
			TestFisierGol teste = new TestFisierGol();
			File f = new File("reteta.txt");
			assertTrue(teste.fileEmpty(f));
		}

		@Test
		public void test2() {
			TestFisierGol teste = new TestFisierGol();
			File f = null;
			assertFalse(teste.fileEmpty(f));
		}
		
	}


}
