package proiect;

public class RetetaCompensata extends RetetaObiect implements Reteta {
	RetetaObiect retetaC;
	public void afisareReteta(){
		System.out.println(retetaC.getNumar() + " " + retetaC.getCantitate() + " " + retetaC.getPret() + " " + retetaC.getSerie());
	}
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
	
	public float getPret(){
		return 0;
	}
	public float getCantitate()
	{
		return 0;
	}
	public void creareReteta(String serie,String numar,float pret, float cantitate)
	{
		
		retetaC=new RetetaObiect(serie,numar,pret,cantitate);
	}


}
