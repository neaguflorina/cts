package proiect;

import java.util.Hashtable;

public class PersoanaPrototype {
	private static Hashtable<String,PersoanaObiect> persoanaM=new Hashtable<String, PersoanaObiect>();
	public static PersoanaObiect getPersoana(String idPersoana)
	{
		PersoanaObiect cPersoana=persoanaM.get(idPersoana);
		return (PersoanaObiect) cPersoana.clone();
	}
	public static void loadCache() {
	      Farmacist farma = new Farmacist();
	      farma.setNume("1");
	      persoanaM.put(farma.getNume(),farma);

	      Client cl = new Client();
	      cl.setNume("2");
	      persoanaM.put(cl.getNume(),cl);
}
}