package proiect;

public interface Reteta {

	public void afisareReteta();
	public void setSerie(String string);
	public void setNumar(String string);
	
	public void setPret(float parseFloat);
	public void setCantitate(float parseFloat);
	public String getSerie();
	public String getNumar();
	
	public float getPret();
	public float getCantitate();
	public void creareReteta(String serie,String numar,float pret, float cantitate);
}
