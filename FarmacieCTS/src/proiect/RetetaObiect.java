package proiect;

public class RetetaObiect implements Cloneable, Reteta {
	public RetetaObiect() {
		
	}

	String serie;
	String numar;
	float pret;
	float cantitate;
	
	public RetetaObiect(String serie, String numar, float pret, float cantitate) {
		this.serie = serie;
		this.numar = numar;
		this.pret = pret;
		this.cantitate=cantitate;
	}
	public String getSerie() {
		return serie;
	}
	public void setSerie(String serie) {
		this.serie = serie;
	}
	public String getNumar() {
		return numar;
	}
	public void setNumar(String numar) {
		this.numar = numar;
	}
	public float getPret() {
		return pret;
	}
	public void setPret(float valoare) {
		this.pret = valoare;
	}
	
	
	public float getCantitate() {
		return cantitate;
	}
	public void setCantitate(float cantitate) {
		this.cantitate = cantitate;
	}
	public Object clone()
	{
		Object clone=null;
		try{
			clone=super.clone();
		}
		catch(CloneNotSupportedException e)
		{
			e.printStackTrace();
		}
		return clone;
	}
	@Override
	public void afisareReteta() {
		System.out.println(this.getNumar() + " " + this.getCantitate() + " " + this.getPret() + " " + this.getSerie());
		
	}
	@Override
	public void creareReteta(String serie, String numar, float pret,
			float cantitate) {
		// TODO Auto-generated method stub
		
	}
	public float costTotal(float pret, float cantitate)
	{
		return pret*cantitate;
	}
	

}


