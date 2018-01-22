import java.util.Random;

public class Statek extends Thread
{
	private Port port;
	int potrzebujeHolownikow;
	private boolean jestWPorcie = false;
	
	public Statek(int potrzebujeHolownikow, Port port, String nazwa)
	{
		super(nazwa);
		this.port = port;
		this.potrzebujeHolownikow = potrzebujeHolownikow;
	}
	
	@Override public void run()
	{
		Random rand = new Random();
		for(int i =0 ; i<10; i++)
		{
			if(jestWPorcie)
			{			
				System.out.println("Statek: "+getName()+" "
					+ "wyp³yn¹³ i zwolni³ " + potrzebujeHolownikow + 
					" holowników");
				port.wyplynZPortu(this);
				jestWPorcie = false;
			}
			else
			{			
				System.out.println("Statek: "+getName()+" "
						+ "wp³yn¹³ i zu¿y³ " + potrzebujeHolownikow + 
						" holowników");	
				jestWPorcie = true;
				port.wplynDoPortu(this);
			}
			try {
				Thread.sleep((int)rand.nextDouble()*100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}