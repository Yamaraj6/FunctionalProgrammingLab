
public class Ksiazka extends Zasob{
	private String autor;
	private String tytul;
	
	public String toString()
	{
		return ""+id +":"+ czy_wypozyczony+
				":"+autor+":"+tytul;
	}
}
