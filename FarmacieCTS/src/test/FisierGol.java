package test;

import static org.junit.Assert.*;

import java.io.File;

import org.junit.Test;

import proiect.TestFisierGol;

public class FisierGol {

	@Test
	public void test() {
		
		File f = new File("reteta.txt");
		TestFisierGol teste = new TestFisierGol();
		assertFalse(teste.fileEmpty(f));
	}

}
