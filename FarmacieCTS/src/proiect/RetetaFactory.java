package proiect;

public class RetetaFactory {
	
	public RetetaObiect getReteta(String tipReteta)
	{
		if(tipReteta== null)
			return null;
		if(tipReteta.equalsIgnoreCase("RetetaCompensata"))
			return new RetetaCompensata();
		else
			if(tipReteta.equalsIgnoreCase("RetetaSimpla"))
				return new RetetaSimpla();
		return null;
		
	}

}
