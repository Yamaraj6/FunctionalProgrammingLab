import java.awt.List;
import java.util.ArrayList;

public class Main 
{
	public static void main(String[] args)
	{
		Zadanie1();
		Zadanie2();
		Zadanie3();
	}
	
	private static void Zadanie1()
	{
        Osoba o = new Osoba("Andrzej", "G");
        Pracownik p = new Pracownik("Janusz", "K", 66);
        Programista pr = new Programista("Zbyszek", "K", 1, "Zbychu");

        Pracownik[] pracownicy = new Pracownik[2];
        pracownicy[0] = p;
        pracownicy[1] = pr;

        for(Osoba x:pracownicy)
        {
            System.out.println(x.drukuj());
        }
    }
	
	private static void Zadanie2()
	{
	    try 
	    {
	        Programista[] programisci = {new Programista("Kuba","W", 2, "Wac³aw")};
	        Pracownik[] pracowniki = programisci;
	        pracowniki[0] = new Pracownik("Andrzej", "J", 2);
	    }
	    catch(ArrayStoreException e)
	    {
	         e.printStackTrace();
	    }
	}
	
	private static void Zadanie3()
	{
		ArrayList list = new ArrayList();
		for(int i= 0; i<10; i++)
		{
			list.add(i);
		}
		DrukujLiczby.drukuj(list);
	}
}