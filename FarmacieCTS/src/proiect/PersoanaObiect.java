package proiect;

public class PersoanaObiect implements Cloneable{


		String nume;
		String prenume;
		int varsta;
		
		public PersoanaObiect() {
			super();
			// TODO Auto-generated constructor stub
		}
		public PersoanaObiect(String nume, String prenume, int varsta) {
		
			this.nume = nume;
			this.prenume = prenume;
			this.varsta = varsta;
		}
		public String getNume() {
			return nume;
		}
		public void setNume(String nume) {
			this.nume = nume;
		}
		public String getPrenume() {
			return prenume;
		}
		public void setPrenume(String prenume) {
			this.prenume = prenume;
		}
		public int getVarsta() {
			return varsta;
		}
		public void setVarsta(int varsta) {
			this.varsta = varsta;
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
		

		public void nume()
		{
			
		}
	}


