import java.util.LinkedList;
import java.util.Map;

public class Biblioteka {
	LinkedList<Zasob> zasoby;
	LinkedList<Czytelnik> czytelnicy;
	Map<Zasob, Czytelnik> historia;
	
	public void Wypozycz(int IdZasobu, int NrKarty)
	{
		for(Zasob zasob : zasoby)
			if(zasob.getId()==IdZasobu)
			{	
				if(!zasob.czy_wypozyczony)
				{	
					zasob.czy_wypozyczony=true;
				}
				return;
			}
	}
	
	public void Zwroc(int Id)
	{
		for(Zasob zasob : zasoby)
			if(zasob.getId()==Id)
			{	
				zasob.czy_wypozyczony=false;
				return;
			}
	}
	
	public void Wyszukaj(int Id)
	{
		for(Zasob zasob : zasoby)
			if(zasob.getId()==Id)
				System.out.print(zasob);
	}
	
}
