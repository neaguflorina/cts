package proiect;

public interface Persoana {
	public void afisarePersoana();
	public void setNume(String string);
	public void setPrenume(String string);
	
	public void setVarsta(int parseInt);
	public String getNume();
	public String getPrenume();
	
	public float getVarsta();
	public void crearePersoana(String nume,String prenume,int varsta);

}
