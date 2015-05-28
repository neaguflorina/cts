package proiect;

public class RetetaSimpla extends RetetaObiect implements Reteta {
	RetetaObiect retetaS;
	public void afisareReteta(){}
	public void setSerie(String string){}
	public void setNumar(String string){}
	public void setPret(float parseFloat){}
	public void setCantitate(float parseFloat){}
	public String getSerie(){
		return null;
	}
	public String getNumar(){
		return null;
	}
	
	public float getCantitate(){
		return 0;
	}
	public float getPret()
	{
		return 0;
	}
	public void creareReteta(String serie,String numar,float pret, float cantitate)
	{
		
		retetaS=new RetetaObiect(serie,numar,pret,cantitate);
	}


}
