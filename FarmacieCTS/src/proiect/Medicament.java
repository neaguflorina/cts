package proiect;

public class Medicament {

	private String nume;
	private String furnizor;
	private int greutate;
	//private int cantitate;
	
	public String getNume() {
		return nume;
	}
	public int getGreutate() {
		return greutate;
	}
	public void setGreutate(int greutate) {
		this.greutate = greutate;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
	public String getFurnizor() {
		return furnizor;
	}
	public void setFurnizor(String furnizor) {
		this.furnizor = furnizor;
	}
	public int getCantitate() {
		return cantitate;
	}
	public void setCantitate(int cantitate) {
		this.cantitate = cantitate;
	}
	private int cantitate;
	
	public int masuraTableta(int greutate,int cantitate)
	{
		return greutate*cantitate;
	}
	
}
