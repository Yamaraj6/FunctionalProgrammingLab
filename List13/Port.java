public class Port {
	private int miejsca;
	private int iloscHolownikow;
	
	public Port(int miejsca, int iloscHolownikow)
	{
		this.miejsca = miejsca;
		this.iloscHolownikow = iloscHolownikow;
	}
	
	public synchronized void wplynDoPortu(Statek statek)
	{
		while(iloscHolownikow < statek.potrzebujeHolownikow
			|| miejsca == 0)
		{	
			try	{ wait();}
			catch (InterruptedException e) {System.out.println(e);}
		}
		miejsca -= 1;
		iloscHolownikow -= statek.potrzebujeHolownikow;
		
		System.out.println("Wolnych Holowników: " + iloscHolownikow 
				+ "\nWolnych Miejsc: "+ miejsca);
	}
	
	public synchronized void wyplynZPortu(Statek statek)
	{
		iloscHolownikow += statek.potrzebujeHolownikow;
		miejsca++;
		notifyAll();
	}
}