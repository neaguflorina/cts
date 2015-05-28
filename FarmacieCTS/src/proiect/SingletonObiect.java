package proiect;

public class SingletonObiect {

	private static SingletonObiect instanta=new SingletonObiect();
	private SingletonObiect(){}
	public static SingletonObiect getInstanta()
	{
		return instanta;
	}
	
	public void showMessage(){
	System.out.println("Acesta este un singleton");
	}
}
