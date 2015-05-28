package proiect;

import java.io.File;
import java.util.Scanner;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*	SingletonObiect obiect = SingletonObiect.getInstanta();
		obiect.showMessage();

		RetetaFactory RF = new RetetaFactory();
		Reteta retetaComp = RF.getReteta("Reteta Compensata");
		retetaComp.afisareReteta();
		Reteta retetaSimp = RF.getReteta("Reteta Simpla");
		retetaSimp.afisareReteta();
		
		PersoanaPrototype.loadCache();

	      PersoanaObiect pers1 = (PersoanaObiect) PersoanaPrototype.getPersoana("1");
	      System.out.println("Persoana : " +  pers1.getNume());		

	      PersoanaObiect pers2 = (PersoanaObiect) PersoanaPrototype.getPersoana("2");
	      System.out.println("Persoana : " + pers2.getNume());	*/
		
		RetetaObiect u;
		File f = new File("reteta.txt");
		try {
			Scanner scanner;
			scanner = new Scanner(f);
			while(scanner.hasNext()){
				String line = scanner.nextLine();
				String[] array = line.split(" ");
				RetetaFactory factory= new RetetaFactory();
u = factory.getReteta("RetetaCompensata");
u.creareReteta(array[0], array[1], Float.parseFloat(array[2]),Float.parseFloat(array[3]));
u.afisareReteta();
			}
			scanner.close();
			
			}
		 catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
