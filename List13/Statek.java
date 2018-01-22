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
					+ "wyp�yn�� i zwolni� " + potrzebujeHolownikow + 
					" holownik�w");
				port.wyplynZPortu(this);
				jestWPorcie = false;
			}
			else
			{			
				System.out.println("Statek: "+getName()+" "
						+ "wp�yn�� i zu�y� " + potrzebujeHolownikow + 
						" holownik�w");	
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