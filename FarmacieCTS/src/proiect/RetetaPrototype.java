package proiect;

import java.util.Hashtable;

public class RetetaPrototype {
	
	private static Hashtable<String,RetetaObiect> retetaM=new Hashtable<String, RetetaObiect>();
	public static RetetaObiect getReteta(String idReteta)
	{
		RetetaObiect cReteta=retetaM.get(idReteta);
		return (RetetaObiect) cReteta.clone();
	}
}
