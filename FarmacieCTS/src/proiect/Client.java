package proiect;

public class Client extends PersoanaObiect{
	
	PersoanaObiect persoanaF;
	public void afisarePersoana(){}
	public void setNume(String string){}
	public void setPrenume(String string){}
	
	
	public void setVarsta(int parseInt){}
	public String getNume(){return null;}
	public String getPrenume(){return null;}
	
	public int getVarsta(){return 0;}
	public void crearePersoana(String nume,String prenume,int varsta){
		persoanaF=new PersoanaObiect(nume,prenume,varsta);
		
	}
}
